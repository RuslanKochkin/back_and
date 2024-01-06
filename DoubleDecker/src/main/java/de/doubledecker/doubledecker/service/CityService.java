package de.doubledecker.doubledecker.service;

import de.doubledecker.doubledecker.controller.dto.CityDTO;
import de.doubledecker.doubledecker.controller.dto.LocationDTO;
import de.doubledecker.doubledecker.domain.City;
import de.doubledecker.doubledecker.domain.Location;
import de.doubledecker.doubledecker.repository.CityRepository;
import de.doubledecker.doubledecker.repository.LocationRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private LocationService locationService;

    @Autowired
    private LocationRepository locationRepository;

    public List<CityDTO> getCitiesForCountry(int countryId) {
        List<City> cities = cityRepository.findByCountry_CountryId(countryId);
        return cities.stream()
                .map(this::getCityDTO)
                .collect(Collectors.toList());
    }

    private CityDTO getCityDTO(City city) {
        List<LocationDTO> locations = locationService.getLocationsForCity(city.getCityId());
        return new CityDTO(city.getCityId(), city.getCity(), city.getCoat_of_arms(), city.getDescription(), locations);
    }

    public LocationDTO addLocation(
            @Min(value = 1, message = "City ID must be at least 1") int cityId,
            @Valid LocationDTO locationDTO
    ) {
        City city = cityRepository.findById(cityId)
                .orElseThrow(() -> new EntityNotFoundException("City not found with id: " + cityId));

        // Assuming that getStreet(), getImageLoc(), getLatitude(), getLongitude(), and getRating() cannot be null or blank in LocationDTO
        Location location = new Location();
        location.setCity(city);
        location.setStreet(locationDTO.getStreet());
        location.setImage_loc(locationDTO.getImageLoc());
        location.setLatitude(locationDTO.getLatitude());
        location.setLongitude(locationDTO.getLongitude());

        // Assuming that getRating() is a positive or zero value
        location.setRating(locationDTO.getRating());

        Location savedLocation = locationRepository.save(location);
        return LocationDTO.convertToLocationDTO(savedLocation);
    }
    public void deleteCityById(int countryId) {
        cityRepository.deleteById(countryId);
    }
}