package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.domain.Event;

@Repository
public interface EvenRepository extends JpaRepository<Event , Integer> {
}
