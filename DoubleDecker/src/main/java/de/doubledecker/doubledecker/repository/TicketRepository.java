package de.doubledecker.doubledecker.repository;

import de.doubledecker.doubledecker.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {
}
