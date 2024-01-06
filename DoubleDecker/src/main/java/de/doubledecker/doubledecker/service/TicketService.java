package de.doubledecker.doubledecker.service;

import de.doubledecker.doubledecker.controller.dto.TicketGet;
import de.doubledecker.doubledecker.domain.Interval;
import de.doubledecker.doubledecker.domain.Location;
import de.doubledecker.doubledecker.domain.Ticket;
import de.doubledecker.doubledecker.domain.User;
import de.doubledecker.doubledecker.repository.TicketRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

import java.util.stream.Collectors;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;


    public Ticket addToCart(
            @NotNull(message = "User cannot be null") @Valid User user,
            @NotNull(message = "Location cannot be null") @Valid Location location,
            @NotNull(message = "Interval cannot be null") @Valid Interval interval,
            @NotNull(message = "Quantity cannot be null") @Min(value = 1, message = "Quantity must be at least 1") Integer quantity,
            @NotNull(message = "Total price cannot be null") @Min(value = 0, message = "Total price cannot be negative") Integer totalPrice
    ) {
        Ticket ticket = new Ticket();
        ticket.setUser(user);
        ticket.setLocation(location);
        ticket.setInterval(interval);
        ticket.setQuantity(quantity);
        ticket.setTotalPrice(totalPrice);
        return ticketRepository.save(ticket);
    }

    // В TicketService
    public List<TicketGet> getAllTickets() {
        List<Ticket> tickets = ticketRepository.findAll();
        return tickets.stream()
                .map(ticket -> {
                    TicketGet ticketGet = new TicketGet();
                    ticketGet.setTicketId(ticket.getTicketId());
                    ticketGet.setUserName(ticket.getUser().getLogin());
                    ticketGet.setUserEmail(ticket.getUser().getEmail());
                    ticketGet.setLocationStreet(ticket.getLocation().getStreet());
                    ticketGet.setIntervalTiming(ticket.getInterval().getTiming());
                    ticketGet.setQuantity(ticket.getQuantity());
                    ticketGet.setTotalPrice(ticket.getTotalPrice());
                    return ticketGet;
                })
                .collect(Collectors.toList());
    }


}