/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tanny
 */
public class FlightDirectory {
    private List<Flights> flightDir;
    private Flights flights;
    private AirlineDirectory airDir;//newly added
    public FlightDirectory(){
        flightDir = new ArrayList<Flights>();
    }

    /**
     * @return the flightDir
     */
    public List<Flights> getFlightDir() {
        return flightDir;
    }

    /**
     * @param flightDir the flightDir to set
     */
    public void setFlightDir(List<Flights> flightDir) {
        this.flightDir = flightDir;
    }
    public Flights addFlight(){
        Flights a = new Flights();
        getFlightDir().add(a);
        return a;
    }
    
    public Flights removeFlight(Flights a){
        getFlightDir().remove(a);
        return a;
    }


    /**
     * @return the flights
     */
    public Flights getFlights() {
        return flights;
    }

    /**
     * @param flights the flights to set
     */
    public void setFlights(Flights flights) {
        this.flights = flights;
    }

    /**
     * @return the airDir
     */
    public AirlineDirectory getAirDir() {
        return airDir;
    }

    /**
     * @param airDir the airDir to set
     */
    public void setAirDir(AirlineDirectory airDir) {
        this.airDir = airDir;
    }
}
