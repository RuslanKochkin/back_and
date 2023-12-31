package de.doubledecker.doubledecker.service;

import de.doubledecker.doubledecker.controller.dto.TicketDTO;
import de.doubledecker.doubledecker.controller.dto.TicketGet;
import de.doubledecker.doubledecker.domain.Interval;
import de.doubledecker.doubledecker.domain.Location;
import de.doubledecker.doubledecker.domain.Ticket;
import de.doubledecker.doubledecker.domain.User;
import de.doubledecker.doubledecker.repository.TicketRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;


    @Autowired
    private LocationService locationService;

    @Autowired
    private IntervalService intervalService;

    public Ticket addToCart(User user, Location location, Interval interval, Integer quantity) {
        Ticket ticket = new Ticket();
        ticket.setUser(user);
        ticket.setLocation(location);
        ticket.setInterval(interval);
        ticket.setQuantity(quantity);
        return ticketRepository.save(ticket);
    }

    // В TicketService
    public List<TicketGet> getAllTickets() {
        List<Ticket> tickets = ticketRepository.findAll();
        return tickets.stream()
                .map(ticket -> {
                    TicketGet ticketGet = new TicketGet();
                    ticketGet.setTicketId(ticket.getTicketId());
                    ticketGet.setUserName(ticket.getUser().getName());
                    ticketGet.setUserEmail(ticket.getUser().getEmail());
                    ticketGet.setLocationStreet(ticket.getLocation().getStreet());
                    ticketGet.setIntervalTiming(ticket.getInterval().getTiming());
                    ticketGet.setQuantity(ticket.getQuantity());
                    return ticketGet;
                })
                .collect(Collectors.toList());
    }


}