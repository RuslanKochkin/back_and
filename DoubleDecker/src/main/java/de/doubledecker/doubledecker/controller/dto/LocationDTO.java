package de.doubledecker.doubledecker.controller.dto;

import de.doubledecker.doubledecker.domain.Location;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LocationDTO {
    private Integer locationId;
    private String street;
    private String imageLoc;
    private Double latitude;
    private Double longitude;
    private String imageMap;
    private Double rating;
    private Integer requests;
    private List<IntervalDTO> intervals;


    public static LocationDTO convertToLocationDTO(Location location) {
        LocationDTO locationDTO = new LocationDTO();
        locationDTO.setLocationId(location.getLocationId());
        locationDTO.setStreet(location.getStreet());
        locationDTO.setImageLoc(location.getImage_loc());
        locationDTO.setLatitude(location.getLatitude());
        locationDTO.setLongitude(location.getLongitude());
        locationDTO.setImageMap(location.getImage_map());
        locationDTO.setRating(location.getRating());
        locationDTO.setRequests(location.getRequests());
        return locationDTO;
    }
}
