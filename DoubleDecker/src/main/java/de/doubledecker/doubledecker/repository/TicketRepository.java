package de.doubledecker.doubledecker.repository;

import de.doubledecker.doubledecker.controller.dto.TicketDTO;
import de.doubledecker.doubledecker.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

}


