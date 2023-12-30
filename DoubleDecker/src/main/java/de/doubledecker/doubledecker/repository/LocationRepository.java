package de.doubledecker.doubledecker.repository;

import de.doubledecker.doubledecker.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LocationRepository extends JpaRepository<Location, Integer> {
    List<Location> findByCity_CityId(int cityId);


    @Query("SELECT SUM(l.requests) FROM Location l")
    int sumRequests();
    @Query("SELECT COUNT(l) FROM Location l")
    int countLocations();
}
