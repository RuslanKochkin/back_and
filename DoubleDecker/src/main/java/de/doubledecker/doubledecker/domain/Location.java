package de.doubledecker.doubledecker.domain;




import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private int locationId;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    private String street;
    private String image_loc;
    private Double latitude;
    private Double longitude;
    private String image_map;
    private Double rating;
    private int requests;

    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    private List<Interval> intervals;

}
