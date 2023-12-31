package de.doubledecker.doubledecker.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private int cityId;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    private String city;
    private String coat_of_arms;
    private String description;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    private List<Location> locations;

}


