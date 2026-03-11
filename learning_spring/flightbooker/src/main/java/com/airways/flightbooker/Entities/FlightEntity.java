package com.airways.flightbooker.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class FlightEntity {
    private long id ;
    private String to;
    private String from;
    private String date;
    
}
