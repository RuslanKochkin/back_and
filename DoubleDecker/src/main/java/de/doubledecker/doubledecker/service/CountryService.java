package de.doubledecker.doubledecker.service;

import de.doubledecker.doubledecker.controller.dto.CityDTO;
import de.doubledecker.doubledecker.controller.dto.CountryDTO;
import de.doubledecker.doubledecker.controller.dto.IntervalDTO;
import de.doubledecker.doubledecker.controller.dto.LocationDTO;
import de.doubledecker.doubledecker.domain.City;
import de.doubledecker.doubledecker.domain.Country;
import de.doubledecker.doubledecker.repository.CityRepository;
import de.doubledecker.doubledecker.repository.CountryRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private CityService cityService;

    @Autowired
    private LocationService locationService;

    @Autowired
    private IntervalService intervalService;

    @Autowired
    private CityRepository cityRepository;


    public List<CountryDTO> findAll() {
        List<Country> countries = countryRepository.findAll();
        return countries.stream()
                .map(this::getCountryDTO)
                .collect(Collectors.toList());
    }

    private CountryDTO getCountryDTO(Country country) {
        List<CityDTO> cities = cityService.getCitiesForCountry(country.getCountryId());
        return new CountryDTO(country.getCountryId(), country.getCountry(), country.getImage_flag(), cities);
    }

    public CountryDTO addCountry(CountryDTO countryDTO) {
        Country country = new Country();
        country.setCountry(countryDTO.getCountry());
        country.setImage_flag(countryDTO.getImageFlag());
        Country savedCountry = countryRepository.save(country);
        return CountryDTO.convertToCountryDTO(savedCountry);
    }

    public CityDTO addCity(int countryId, CityDTO cityDTO) {
        Country country = countryRepository.findById(countryId)
                .orElseThrow(() -> new EntityNotFoundException("Country not found with id: " + countryId));
        City city = new City();
        city.setCountry(country);
        city.setCity(cityDTO.getCity());
        city.setCoat_of_arms(cityDTO.getCoatOfArms());
        city.setDescription(cityDTO.getDescription());
        City savedCity = cityRepository.save(city);
        return CityDTO.convertToCityDTO(savedCity);
    }

    public void deleteCountryById(int countryId) {
        countryRepository.deleteById(countryId);
    }
}

