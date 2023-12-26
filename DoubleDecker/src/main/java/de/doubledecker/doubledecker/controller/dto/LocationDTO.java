package de.doubledecker.doubledecker.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class LocationDTO {
    private Integer locationId;
    private String street;
    private String imgLoc;
    private String latitude;
    private String longitude;
    private String imageMap;
    private Double rating;
    private List<IntervalDTO> intervals;
}
