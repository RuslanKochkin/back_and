package de.doubledecker.doubledecker.service;

import de.doubledecker.doubledecker.controller.dto.IntervalDTO;
import de.doubledecker.doubledecker.controller.dto.LocationDTO;
import de.doubledecker.doubledecker.domain.Location;
import de.doubledecker.doubledecker.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private IntervalService intervalService; // Предполагается, что у вас есть сервис для Interval

    public List<LocationDTO> getLocationsForCity(int cityId) {
        List<Location> locations = locationRepository.findByCity_CityId(cityId);
        return locations.stream()
                .map(this::getLocationDTO)
                .collect(Collectors.toList());
    }

    private LocationDTO getLocationDTO(Location location) {
        List<IntervalDTO> intervals = intervalService.getIntervalsForLocation(location.getLocationId());
        return new LocationDTO(location.getLocationId(), location.getStreet(), location.getImg_loc(), location.getLatitude(), location.getLongitude(), location.getImage_map(), location.getRating(), intervals);
    }
}
