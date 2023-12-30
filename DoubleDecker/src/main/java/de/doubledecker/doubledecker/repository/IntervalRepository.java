package de.doubledecker.doubledecker.repository;

import de.doubledecker.doubledecker.domain.Interval;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface IntervalRepository extends JpaRepository<Interval, Integer> {
    List<Interval> findByLocation_LocationId(int cityId);

    @Transactional
    @Modifying
    @Query("UPDATE Interval i SET i.available_tickets = i.available_tickets - :quantity WHERE i.intervalId = :intervalId")
    void decreaseAvailableTickets(@Param("intervalId") int intervalId, @Param("quantity") int quantity);

}
