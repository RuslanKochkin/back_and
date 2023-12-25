package de.doubledecker.doubledecker.repository;

import de.doubledecker.doubledecker.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {
}
