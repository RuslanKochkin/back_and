package de.doubledecker.doubledecker.service;

import de.doubledecker.doubledecker.controller.dto.CityDTO;
import de.doubledecker.doubledecker.controller.dto.CountryDTO;
import de.doubledecker.doubledecker.controller.dto.IntervalDTO;
import de.doubledecker.doubledecker.controller.dto.LocationDTO;
import de.doubledecker.doubledecker.domain.City;
import de.doubledecker.doubledecker.domain.Country;
import de.doubledecker.doubledecker.repository.CityRepository;
import de.doubledecker.doubledecker.repository.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
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

    public CountryDTO addCountry(
            @NotNull(message = "CountryDTO cannot be null") @Valid CountryDTO countryDTO
    ) {
        // Assuming that getCountry() and getImageFlag() cannot be null or blank in CountryDTO
        Country country = new Country();
        country.setCountry(countryDTO.getCountry());
        country.setImage_flag(countryDTO.getImageFlag());

        Country savedCountry = countryRepository.save(country);
        return CountryDTO.convertToCountryDTO(savedCountry);
    }

    public CityDTO addCity(
            @Min(value = 1, message = "Country ID must be at least 1") int countryId,
            @NotNull(message = "CityDTO cannot be null") @Valid CityDTO cityDTO
    ) {
        Country country = countryRepository.findById(countryId)
                .orElseThrow(() -> new EntityNotFoundException("Country not found with id: " + countryId));

        // Assuming that getCity(), getCoatOfArms(), and getDescription() cannot be null or blank in CityDTO
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

