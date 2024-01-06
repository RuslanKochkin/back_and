package de.doubledecker.doubledecker.controller;

import de.doubledecker.doubledecker.controller.dto.CountryDTO;
import de.doubledecker.doubledecker.controller.dto.TicketDTO;
import de.doubledecker.doubledecker.domain.Interval;
import de.doubledecker.doubledecker.domain.Location;
import de.doubledecker.doubledecker.domain.Ticket;
import de.doubledecker.doubledecker.domain.User;
import de.doubledecker.doubledecker.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/tours")
public class UserController {


    @Autowired
    private LocationService locationService;

    @Autowired
    private IntervalService intervalService;

    @Autowired
    UserService userService;

    @Autowired
    TicketService ticketService;


    @Autowired
    private CountryService countryService;

    @PostMapping("/TicketAdd")
    public ResponseEntity<Ticket> addToCart(@RequestBody TicketDTO ticketDTO) {
        try {
            User user = userService.getUserById(ticketDTO.getUserId().getUserId());
            Location location = locationService.getLocationById(ticketDTO.getLocationId());
            Interval interval = intervalService.getIntervalById(ticketDTO.getIntervalId());
            if (interval.getAvailable_tickets() < ticketDTO.getQuantity()) {
                return ResponseEntity.badRequest().build();
            }
            Ticket addedTicket = ticketService.addToCart(user, location, interval, ticketDTO.getQuantity(),ticketDTO.getTotalPrice());
            interval.setAvailable_tickets(interval.getAvailable_tickets() - ticketDTO.getQuantity());
            intervalService.updateIntervalById(interval.getIntervalId(), interval);

            locationService.updateRatingBasedOnRequests(location.getLocationId());
            return ResponseEntity.ok(addedTicket);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
