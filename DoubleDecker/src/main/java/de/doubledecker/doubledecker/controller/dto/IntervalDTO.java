package de.doubledecker.doubledecker.controller.dto;

import de.doubledecker.doubledecker.domain.Interval;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class IntervalDTO {
    private Integer intervalId;
    private String timing;
    private Integer availableTickets;
    private Double price;



    public static IntervalDTO convertToIntervalDTO(Interval interval) {
        IntervalDTO intervalDTO = new IntervalDTO();
        intervalDTO.setIntervalId(interval.getIntervalId());
        intervalDTO.setTiming(interval.getTiming());
        intervalDTO.setAvailableTickets(interval.getAvailable_tickets());
        intervalDTO.setPrice(interval.getPrice());
        return intervalDTO;
    }
}
