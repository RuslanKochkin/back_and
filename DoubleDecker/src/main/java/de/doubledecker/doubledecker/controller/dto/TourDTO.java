package de.doubledecker.doubledecker.controller.dto;



import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;


@Getter
@AllArgsConstructor
public class TourDTO {
    private Integer countryId;
    private String country;
    private String imageFlag;
    private List<CityDTO> cities;
}

