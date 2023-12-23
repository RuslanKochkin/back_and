package de.doubledecker.doubledecker.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "countries")
    public class Country{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "country_id")
        private int countryId;
        private String country;
        private String countryImgFlag;
    }

