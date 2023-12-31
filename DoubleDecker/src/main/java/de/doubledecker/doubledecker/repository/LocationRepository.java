package de.doubledecker.doubledecker.repository;

import de.doubledecker.doubledecker.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface LocationRepository extends JpaRepository<Location, Integer> {
    List<Location> findByCity_CityId(int cityId);

    Optional<Location> findByStreet(String street);


    @Query("SELECT SUM(l.requests) FROM Location l")
    int sumRequests();
    @Query("SELECT COUNT(l) FROM Location l")
    int countLocations();
}
