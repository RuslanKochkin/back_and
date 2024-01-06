package de.doubledecker.doubledecker.controller.dto;


import de.doubledecker.doubledecker.domain.City;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CityDTO {
    private Integer cityId;
    private String city;
    private String coatOfArms;
    private String description;
    private List<LocationDTO> locations;



    public static CityDTO convertToCityDTO(City city) {
        CityDTO cityDTO = new CityDTO();
        cityDTO.setCityId(city.getCityId());
        cityDTO.setCity(city.getCity());
        cityDTO.setCoatOfArms(city.getCoat_of_arms());
        cityDTO.setDescription(city.getDescription());
        return cityDTO;
    }
}
