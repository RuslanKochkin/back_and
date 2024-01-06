package de.doubledecker.doubledecker.controller.dto;

import de.doubledecker.doubledecker.domain.Ticket;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TicketGet {
    private Long ticketId;
    private String userName;
    private String userEmail;
    private String locationStreet;
    private String intervalTiming;
    private Integer quantity;
    private Integer totalPrice;

    private TicketGet convertToTicketGet(Ticket ticket) {
        return new TicketGet(
                ticket.getTicketId(),
                ticket.getUser().getLogin(),
                ticket.getUser().getEmail(),
                ticket.getLocation().getStreet(),
                ticket.getInterval().getTiming(),
                ticket.getQuantity(),
                ticket.getTotalPrice()
        );
    }
}
