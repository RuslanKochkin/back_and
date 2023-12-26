package de.doubledecker.doubledecker.repository;

import de.doubledecker.doubledecker.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Integer> {
    List<City> findByCountry_CountryId(int countryId);
}
