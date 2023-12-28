package de.doubledecker.doubledecker.controller.dto;

import de.doubledecker.doubledecker.domain.Country;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CountryDTO {
    private Integer countryId;
    private String country;
    private String imageFlag;
    private List<CityDTO> cities;


    public static CountryDTO convertToCountryDTO(Country country) {
        CountryDTO countryDTO = new CountryDTO();
        countryDTO.setCountryId(country.getCountryId());
        countryDTO.setCountry(country.getCountry());
        countryDTO.setImageFlag(country.getImage_flag());
        return countryDTO;
    }
}

