package de.doubledecker.doubledecker.repository;

import de.doubledecker.doubledecker.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocationRepository extends JpaRepository<Location, Integer> {
    List<Location> findByCity_CityId(int cityId);
}
