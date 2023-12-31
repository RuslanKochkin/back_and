package de.doubledecker.doubledecker.domain;

import de.doubledecker.doubledecker.controller.dto.IntervalDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "intervals")
public class Interval {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "interval_id")
    private int intervalId;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    private String timing;

    @Column(name = "available_tickets")
    private int available_tickets;
    private double price;

}
