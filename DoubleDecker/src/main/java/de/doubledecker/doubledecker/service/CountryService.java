package de.doubledecker.doubledecker.service;

import de.doubledecker.doubledecker.controller.dto.CityDTO;
import de.doubledecker.doubledecker.controller.dto.TourDTO;
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

    public List<TourDTO> findAll() {
        List<Country> countries = countryRepository.findAll();
        return countries.stream()
                .map(this::getTourDTO)
                .collect(Collectors.toList());
    }

    private TourDTO getTourDTO(Country country) {
        List<CityDTO> cities = cityService.getCitiesForCountry(country.getCountryId());
        return new TourDTO(country.getCountryId(), country.getCountry(), country.getImage_flag(), cities);
    }
}
