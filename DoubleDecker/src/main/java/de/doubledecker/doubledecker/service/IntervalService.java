package de.doubledecker.doubledecker.service;

import de.doubledecker.doubledecker.controller.dto.IntervalDTO;
import de.doubledecker.doubledecker.controller.dto.LocationDTO;
import de.doubledecker.doubledecker.domain.Interval;
import de.doubledecker.doubledecker.domain.Location;
import de.doubledecker.doubledecker.repository.IntervalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IntervalService {

    @Autowired
    private IntervalRepository intervalRepository;

    public List<IntervalDTO> getIntervalsForLocation(Integer locationId) {
        List<Interval> intervals = intervalRepository.findByLocation_LocationId(locationId);
        return intervals.stream()
                .map(this::getIntervalDTO)
                .collect(Collectors.toList());
    }

    private IntervalDTO getIntervalDTO(Interval interval) {
        return new IntervalDTO(interval.getIntervalId(), interval.getTiming(), interval.getAvailable_tickets(), interval.getPrice());
    }

    public Interval updateIntervalById(int intervalId, IntervalDTO updatedIntervalDTO) {
        Interval existingInterval = intervalRepository.findById(intervalId);

        if (existingInterval != null) {

            existingInterval.setTiming(updatedIntervalDTO.getTiming());
            existingInterval.setAvailable_tickets(updatedIntervalDTO.getAvailableTickets());
            existingInterval.setPrice(updatedIntervalDTO.getPrice());

            return intervalRepository.save(existingInterval);
        } else {
            throw new IllegalArgumentException("Interval with ID " + intervalId + " not found.");
        }
    }
}
