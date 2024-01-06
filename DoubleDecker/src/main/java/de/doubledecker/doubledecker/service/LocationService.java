package de.doubledecker.doubledecker.service;
;
import de.doubledecker.doubledecker.controller.dto.IntervalDTO;
import de.doubledecker.doubledecker.controller.dto.LocationDTO;

import de.doubledecker.doubledecker.domain.Interval;
import de.doubledecker.doubledecker.domain.Location;
import de.doubledecker.doubledecker.repository.IntervalRepository;
import de.doubledecker.doubledecker.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private IntervalService intervalService;
    @Autowired
    private IntervalRepository intervalRepository;


    public Location getLocationById(int locationId) {
        return locationRepository.findById(locationId)
                .orElseThrow(() -> new EntityNotFoundException("Location not found with id: " + locationId));
    }
    public List<LocationDTO> getLocationsForCity(int cityId) {
        List<Location> locations = locationRepository.findByCity_CityId(cityId);
        return locations.stream()
                .map(this::getLocationDTO)
                .collect(Collectors.toList());
    }

    private LocationDTO getLocationDTO(Location location) {
        List<IntervalDTO> intervals = intervalService.getIntervalsForLocation(location.getLocationId());
        return new LocationDTO(location.getLocationId(), location.getStreet(), location.getImage_loc(), location.getLatitude(), location.getLongitude(), location.getImage_map(), location.getRating(), location.getRequests(), intervals);
    }

    public IntervalDTO addInterval(
            @Min(value = 1, message = "Location ID must be at least 1") int locationId,
            @NotNull(message = "IntervalDTO cannot be null") @Valid IntervalDTO intervalDTO
    ) {
        Location location = locationRepository.findById(locationId)
                .orElseThrow(() -> new EntityNotFoundException("Location not found with id: " + locationId));

        Interval interval = new Interval();
        interval.setLocation(location);

        // Assuming that getTiming(), getAvailableTickets(), and getPrice() cannot be null in IntervalDTO
        interval.setTiming(intervalDTO.getTiming());
        interval.setAvailable_tickets(intervalDTO.getAvailableTickets());
        interval.setPrice(intervalDTO.getPrice());

        Interval savedInterval = intervalRepository.save(interval);
        return IntervalDTO.convertToIntervalDTO(savedInterval);
    }

    public Location updateLocationById(
            @NotNull(message = "Location ID cannot be null") @Min(value = 1, message = "Location ID must be at least 1") Integer locationId,
            @NotNull(message = "UpdatedLocationDTO cannot be null") @Valid LocationDTO updatedLocationDTO
    ) {
        Location existingLocation = locationRepository.findById(locationId)
                .orElseThrow(() -> new IllegalArgumentException("Location not found"));

        // Assuming that getStreet(), getImageLoc(), getLatitude(), getLongitude(),
        // getImageMap(), and getRating() cannot be null in LocationDTO
        existingLocation.setStreet(updatedLocationDTO.getStreet());
        existingLocation.setImage_loc(updatedLocationDTO.getImageLoc());
        existingLocation.setLatitude(updatedLocationDTO.getLatitude());
        existingLocation.setLongitude(updatedLocationDTO.getLongitude());
        existingLocation.setImage_map(updatedLocationDTO.getImageMap());

        // Assuming that getRating() is a positive or zero value
        existingLocation.setRating(updatedLocationDTO.getRating());

        return locationRepository.save(existingLocation);
    }

    @Transactional
    public Location updateRatingBasedOnRequests(Integer locationId) {
        Location location = locationRepository.findById(locationId)
                .orElseThrow(() -> new IllegalArgumentException("Location not found"));
        location.setRequests(location.getRequests() + 1);
        double rating = (double) location.getRequests() / (1 + location.getRequests()) * 10;
        location.setRating(rating);
        return locationRepository.save(location);
    }
    public Location getLocationByStreet(String street) {
        Optional<Location> optionalLocation = locationRepository.findByStreet(street);

        if (optionalLocation.isPresent()) {
            return optionalLocation.get();
        } else {
            throw new EntityNotFoundException("Location not found with street: " + street);
        }
    }

    public void deleteLocationById(int locationId) {
        locationRepository.deleteById(locationId);
    }
}

