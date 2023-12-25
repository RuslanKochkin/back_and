package de.doubledecker.doubledecker.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "intervals")
public class Interval {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "interval_id")
    private Long intervalId;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    private String timing;
    private Integer availableTickets;
    private Double price;
}
