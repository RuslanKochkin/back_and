package de.doubledecker.doubledecker.controller.dto;

import de.doubledecker.doubledecker.controller.dto.UserDTO;
import de.doubledecker.doubledecker.domain.Ticket;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TicketDTO {
    private Long ticketId;
    private UserDTO userId;
    private Integer locationId;
    private Integer intervalId;
    private Integer quantity;
    private Integer totalPrice;

    public static TicketDTO convertToTicketDTO(Ticket ticket) {
        TicketDTO ticketDTO = new TicketDTO();
        ticketDTO.setTicketId(ticket.getTicketId());
        ticketDTO.setUserId(UserDTO.convertToUserDTO(ticket.getUser()));
        ticketDTO.setLocationId(ticket.getLocation().getLocationId());
        ticketDTO.setIntervalId(ticket.getInterval().getIntervalId());
        ticketDTO.setQuantity(ticket.getQuantity());
        ticketDTO.setTotalPrice(ticket.getTotalPrice());
        return ticketDTO;
    }
}

