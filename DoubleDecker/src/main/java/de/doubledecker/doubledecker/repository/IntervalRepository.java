package de.doubledecker.doubledecker.repository;

import de.doubledecker.doubledecker.domain.Interval;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IntervalRepository extends JpaRepository<Interval, Integer> {
    List<Interval> findByLocation_LocationId(int cityId);
    Interval findById(int intervalId);
}
