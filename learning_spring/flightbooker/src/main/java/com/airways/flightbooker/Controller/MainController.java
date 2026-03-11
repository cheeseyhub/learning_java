package com.airways.flightbooker.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airways.flightbooker.Entities.FlightEntity;

@RestController
@RequestMapping("/flight")
public class MainController {
    private HashMap<Long,FlightEntity> flights = new HashMap<>();




@GetMapping
public List<FlightEntity> getFlights() {
    return new ArrayList<>(flights.values());

}
@PostMapping
public void addFlight(@RequestBody FlightEntity currentFlight)
{
    flights.put(currentFlight.getId(), currentFlight);

}
@DeleteMapping("/{flightToDeleteId}")
public void deleteFlight(@PathVariable long flightToDeleteId)
{
    flights.remove(flightToDeleteId);

}
@PutMapping()
public void updateFlight(@RequestBody FlightEntity flight)
{
    flights.put(flight.getId(), flight);
}
}
