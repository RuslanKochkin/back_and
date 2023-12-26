package de.doubledecker.doubledecker.controller.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class CityDTO {
    private Integer cityId;
    private String city;
    private String coatOfArms;
    private String description;
    private List<LocationDTO> locations;
}
