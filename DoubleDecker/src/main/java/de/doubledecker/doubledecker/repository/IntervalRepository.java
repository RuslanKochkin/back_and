package de.doubledecker.doubledecker.repository;

import de.doubledecker.doubledecker.domain.Interval;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IntervalRepository extends JpaRepository<Interval, Integer> {
}
