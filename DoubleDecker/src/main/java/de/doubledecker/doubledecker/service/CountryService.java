package de.doubledecker.doubledecker.service;

import de.doubledecker.doubledecker.controller.dto.CityDTO;
import de.doubledecker.doubledecker.controller.dto.CountryDTO;
import de.doubledecker.doubledecker.domain.Country;
import de.doubledecker.doubledecker.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private CityService cityService; // Предполагается, что у вас есть сервис для City

    public List<CountryDTO> findAll() {
        List<Country> countries = countryRepository.findAll();
        return countries.stream()
                .map(this::getTourDTO)
                .collect(Collectors.toList());
    }

    private CountryDTO getTourDTO(Country country) {
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
}
