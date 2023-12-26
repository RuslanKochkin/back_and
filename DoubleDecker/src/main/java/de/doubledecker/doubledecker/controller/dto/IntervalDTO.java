package de.doubledecker.doubledecker.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class IntervalDTO {
    private Integer intervalId;
    private String timing;
    private Integer availableTickets;
    private Double price;
}
