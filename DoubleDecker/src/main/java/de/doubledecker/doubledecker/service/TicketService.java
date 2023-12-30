package de.doubledecker.doubledecker.service;

import de.doubledecker.doubledecker.domain.Interval;
import de.doubledecker.doubledecker.domain.Location;
import de.doubledecker.doubledecker.domain.Ticket;
import de.doubledecker.doubledecker.domain.User;
import de.doubledecker.doubledecker.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private LocationService locationService;

    @Autowired
    private IntervalService intervalService;

    public Ticket addToCart(User user, Location location, Integer quantity) {
        Ticket ticket = new Ticket();
        ticket.setUser(user);
        ticket.setLocation(location);
        ticket.setQuantity(quantity);
        return ticketRepository.save(ticket);
    }

}