package de.doubledecker.doubledecker.service;
;
import de.doubledecker.doubledecker.controller.dto.IntervalDTO;
import de.doubledecker.doubledecker.controller.dto.LocationDTO;

import de.doubledecker.doubledecker.domain.Interval;
import de.doubledecker.doubledecker.domain.Location;
import de.doubledecker.doubledecker.repository.IntervalRepository;
import de.doubledecker.doubledecker.repository.LocationRepository;
import jakarta.persistence.EntityNotFoundException;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private IntervalService intervalService;
    @Autowired
    private IntervalRepository intervalRepository;

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

    public IntervalDTO addInterval(int locationId, IntervalDTO intervalDTO) {
        Location location = locationRepository.findById(locationId)
                .orElseThrow(() -> new EntityNotFoundException("City not found with id: " + locationId));
        Interval interval = new Interval();
        interval.setLocation(location);
        interval.setTiming(intervalDTO.getTiming());
        interval.setAvailable_tickets(intervalDTO.getAvailableTickets());
        interval.setPrice(intervalDTO.getPrice());
        Interval savedInterval = intervalRepository.save(interval);
        return IntervalDTO.convertToIntervalDTO(savedInterval);
    }

    public Location updateLocationById(Integer locationId, LocationDTO updatedLocationDTO) {
        Location existingLocation = locationRepository.findById(locationId)
                .orElseThrow(() -> new IllegalArgumentException("Location not found"));
        existingLocation.setStreet(updatedLocationDTO.getStreet());
        existingLocation.setImage_loc(updatedLocationDTO.getImageLoc());
        existingLocation.setLatitude(updatedLocationDTO.getLatitude());
        existingLocation.setLongitude(updatedLocationDTO.getLongitude());
        existingLocation.setImage_map(updatedLocationDTO.getImageMap());
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
}

