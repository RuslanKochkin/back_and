package de.doubledecker.doubledecker.controller;


import de.doubledecker.doubledecker.controller.dto.*;

import de.doubledecker.doubledecker.domain.Interval;
import de.doubledecker.doubledecker.domain.Location;
import de.doubledecker.doubledecker.domain.Ticket;
import de.doubledecker.doubledecker.domain.User;
import de.doubledecker.doubledecker.repository.LocationRepository;
import de.doubledecker.doubledecker.service.*;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

import static de.doubledecker.doubledecker.controller.dto.LocationDTO.convertToLocationDTO;

@RestController
@RequestMapping("/tours")
public class AdminController {

    @Autowired
    private CountryService countryService;

    @Autowired
    private CityService cityService;

    @Autowired
    private LocationService locationService;

    @Autowired
    private IntervalService intervalService;



    @Autowired
    UserService userService;
    @Autowired
    TicketService ticketService;

    @GetMapping("/all")
    public List<CountryDTO> getAllTours() {
        return countryService.findAll();
    }

    @PostMapping("/add/country")
    public ResponseEntity<CountryDTO> addCountry(@RequestBody CountryDTO countryDTO) {
        try {
            CountryDTO addedCountry = countryService.addCountry(countryDTO);
            return new ResponseEntity<>(addedCountry, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("add/city/{countryId}")
    public ResponseEntity<CityDTO> addCity(@PathVariable Integer countryId, @RequestBody CityDTO cityDTO
    ) {
        try {
            CityDTO addedCity = countryService.addCity(countryId, cityDTO);
            return new ResponseEntity<>(addedCity, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/add/location/{cityId}")
    public ResponseEntity<LocationDTO> addLocation(@PathVariable Integer cityId, @RequestBody LocationDTO locationDTO
    ) {
        try {
            LocationDTO addedLocation = cityService.addLocation(cityId, locationDTO);
            return new ResponseEntity<>(addedLocation, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/add/interval/{locationId}")
    public ResponseEntity<IntervalDTO> addInterval(
            @PathVariable Integer locationId,
            @RequestBody IntervalDTO intervalDTO
    ) {
        try {
            IntervalDTO addedInterval = locationService.addInterval(locationId, intervalDTO);
            return new ResponseEntity<>(addedInterval, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update/{intervalId}")
    public ResponseEntity<?> updateInterval(@PathVariable Integer intervalId, @RequestBody IntervalDTO updatedIntervalDTO) {
        try {
            Interval updatedInterval = intervalService.updateIntervalById(intervalId, convertToInterval(updatedIntervalDTO));
            return new ResponseEntity<>(updatedInterval, HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private Interval convertToInterval(IntervalDTO intervalDTO) {
        Interval interval = new Interval();
        interval.setTiming(intervalDTO.getTiming());
        interval.setAvailable_tickets(intervalDTO.getAvailableTickets());
        interval.setPrice(intervalDTO.getPrice());
        // Другие установки полей по необходимости
        return interval;
    }

    @PutMapping("/update/{locationId}")
    public ResponseEntity<?> updateLocation(@PathVariable Integer locationId, @RequestBody LocationDTO updatedLocationDTO) {
        try {
            Location updatedLocation = locationService.updateLocationById(locationId, updatedLocationDTO);
            return new ResponseEntity<>(updatedLocation, HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update-rating/{locationId}")
    public ResponseEntity<LocationDTO> updateRatingBasedOnRequests(@PathVariable Integer locationId) {
        try {
            Location updatedLocation = locationService.updateRatingBasedOnRequests(locationId);
            LocationDTO updatedLocationDTO = convertToLocationDTO(updatedLocation);
            return new ResponseEntity<>(updatedLocationDTO, HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/addToTicket")
    public ResponseEntity<Ticket> addToCart(@RequestBody TicketDTO ticketDTO) {
        try {
            User user = userService.getUserById(ticketDTO.getUserId().getUserId());
            Location location = locationService.getLocationById(ticketDTO.getLocationId());
            Interval interval = intervalService.getIntervalById(ticketDTO.getIntervalId());
            if (interval.getAvailable_tickets() < ticketDTO.getQuantity()) {
                return ResponseEntity.badRequest().build();
            }
            Ticket addedTicket = ticketService.addToCart(user, location, interval, ticketDTO.getQuantity());
            interval.setAvailable_tickets(interval.getAvailable_tickets() - ticketDTO.getQuantity());
            intervalService.updateIntervalById(interval.getIntervalId(), interval);

            locationService.updateRatingBasedOnRequests(location.getLocationId());
            return ResponseEntity.ok(addedTicket);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    // В TicketController
    @GetMapping("/api/tickets")
    public ResponseEntity<List<TicketGet>> getAllTickets() {
        List<TicketGet> ticketGets = ticketService.getAllTickets();
        return new ResponseEntity<>(ticketGets, HttpStatus.OK);
    }


    @DeleteMapping("/deleteCountry/{countryId}")
    public ResponseEntity<String> deleteCountry(@PathVariable int countryId) {
        countryService.deleteCountryById(countryId);
        return new ResponseEntity<>("Country and associated data deleted successfully", HttpStatus.OK);
    }

    @DeleteMapping("/deleteCity/{cityId}")
    public ResponseEntity<String> deleteCity(@PathVariable int cityId) {
        cityService.deleteCityById(cityId);
        return new ResponseEntity<>("City and associated data deleted successfully", HttpStatus.OK);
    }

    @DeleteMapping("/deleteLocation/{locationId}")
    public ResponseEntity<String> deleteLocation(@PathVariable int locationId) {
        locationService.deleteLocationById(locationId);
        return new ResponseEntity<>("Location and associated data deleted successfully", HttpStatus.OK);
    }

    @DeleteMapping("/deleteIntervalId/{intervalId}")
    public ResponseEntity<String> deleteInterval(@PathVariable int intervalId) {
        intervalService.deleteIntervalById(intervalId);
        return new ResponseEntity<>("Interval and associated data deleted successfully", HttpStatus.OK);
    }

}

