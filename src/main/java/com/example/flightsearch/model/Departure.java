package com.example.flightsearch.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Getter
@Setter
public class Departure {

    @Id
    private String flightNumber;
    @ManyToOne
    private Airport departureAirport;
    @ManyToOne
    private Airport arrivalAirport;
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Airline airline;
    private Instant departureDate;
    private Instant dateOfLanding;
}
