package de.doubledecker.doubledecker.service;

import de.doubledecker.doubledecker.controller.dto.CityDTO;
import de.doubledecker.doubledecker.controller.dto.LocationDTO;
import de.doubledecker.doubledecker.domain.City;
import de.doubledecker.doubledecker.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private LocationService locationService; // Предполагается, что у вас есть сервис для Location

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
}