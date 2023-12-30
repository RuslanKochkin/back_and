package de.doubledecker.doubledecker.controller.dto;

import de.doubledecker.doubledecker.domain.Location;
import de.doubledecker.doubledecker.domain.User;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class TicketDTO {
    private Long ticketId;
    private User userId;
    private Integer locationId;
    private Integer quantity;
}
