package com.example.flightsearch.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Airline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String airlineName;
    @OneToMany(mappedBy = "airline")
    private List<Departure> departures;
}
