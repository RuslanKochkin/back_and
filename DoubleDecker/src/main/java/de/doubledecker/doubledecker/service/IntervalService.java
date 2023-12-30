package de.doubledecker.doubledecker.service;

import de.doubledecker.doubledecker.controller.dto.IntervalDTO;
import de.doubledecker.doubledecker.domain.Interval;
import de.doubledecker.doubledecker.repository.IntervalRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;



import java.util.List;
import java.util.Optional;
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

    public Interval updateIntervalById(int intervalId, Interval updatedInterval) {
        Interval existingInterval = intervalRepository.findById(intervalId)
                .orElseThrow(() -> new EntityNotFoundException("Interval not found with id: " + intervalId));
        existingInterval.setTiming(updatedInterval.getTiming());
        existingInterval.setAvailable_tickets(updatedInterval.getAvailable_tickets());
        existingInterval.setPrice(updatedInterval.getPrice());
        return intervalRepository.save(existingInterval);
    }

    public List<Interval> getAllIntervals() {
        return intervalRepository.findAll();
    }
    public void updateAvailableTicketsForAllIntervals(int newAvailableTickets) {
        List<Interval> allIntervals = intervalRepository.findAll();
        for (Interval interval : allIntervals) {
            interval.setAvailable_tickets(newAvailableTickets);
        }
        intervalRepository.saveAll(allIntervals);
    }
}

