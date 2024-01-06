package de.doubledecker.doubledecker.service;

import de.doubledecker.doubledecker.controller.dto.IntervalDTO;
import de.doubledecker.doubledecker.domain.Interval;
import de.doubledecker.doubledecker.repository.IntervalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.stream.Collectors;




@Service
public class IntervalService {

    @Autowired
    private IntervalRepository intervalRepository;


    public Interval getIntervalById(int intervalId) {
        return intervalRepository.findById(intervalId)
                .orElseThrow(() -> new EntityNotFoundException("Interval not found with id: " + intervalId));
    }

    public List<IntervalDTO> getIntervalsForLocation(Integer locationId) {
        List<Interval> intervals = intervalRepository.findByLocation_LocationId(locationId);
        return intervals.stream()
                .map(this::getIntervalDTO)
                .collect(Collectors.toList());
    }

    private IntervalDTO getIntervalDTO(Interval interval) {
        return new IntervalDTO(interval.getIntervalId(), interval.getTiming(), interval.getAvailable_tickets(), interval.getPrice());
    }

    public Interval updateIntervalById(
            @Min(value = 1, message = "Interval ID must be at least 1") int intervalId,
            @NotNull(message = "UpdatedInterval cannot be null") @Valid Interval updatedInterval
    ) {
        Interval existingInterval = intervalRepository.findById(intervalId)
                .orElseThrow(() -> new EntityNotFoundException("Interval not found with id: " + intervalId));

        // Assuming that getTiming(), getAvailable_tickets(), and getPrice() cannot be null in Interval
        existingInterval.setTiming(updatedInterval.getTiming());

        // Assuming that getAvailable_tickets() is a positive value
        existingInterval.setAvailable_tickets(updatedInterval.getAvailable_tickets());

        // Assuming that getPrice() is a positive value
        existingInterval.setPrice(updatedInterval.getPrice());

        return intervalRepository.save(existingInterval);
    }



    public void updateAvailableTicketsForAllIntervals(int newAvailableTickets) {
        List<Interval> allIntervals = intervalRepository.findAll();
        for (Interval interval : allIntervals) {
            interval.setAvailable_tickets(newAvailableTickets);
        }
        intervalRepository.saveAll(allIntervals);
    }

    public List<Interval> getAllIntervals() {
        return intervalRepository.findAll();
    }
    public Interval getIntervalByTiming(String timing) {
        return intervalRepository.findByTiming(timing)
                .orElseThrow(() -> new EntityNotFoundException("Interval not found with timing: " + timing));
    }

    public void deleteIntervalById(int intervalId) {
        intervalRepository.deleteById(intervalId);
    }
}

