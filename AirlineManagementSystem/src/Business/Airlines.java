/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Tanmayee Kalluri
 */
public class Airlines {
    private String airlinerName;
    private int airlinerCode;
    private String homeGround;
    private int numAirplanes;
    private Flights flights;//check later if this is correct
    private FlightDirectory flightdir;

    public FlightDirectory getFlightdir() {
        return flightdir;
    }

    public void setFlightdir(FlightDirectory flightdir) {
        this.flightdir = flightdir;
    }
    /**
     * @return the airlinerName
     */
    public String getAirlinerName() {
        return airlinerName;
    }

    /**
     * @param airlinerName the airlinerName to set
     */
    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    /**
     * @return the airlinerCode
     */
    public int getAirlinerCode() {
        return airlinerCode;
    }

    /**
     * @param airlinerCode the airlinerCode to set
     */
    public void setAirlinerCode(int airlinerCode) {
        this.airlinerCode = airlinerCode;
    }

    /**
     * @return the homeGround
     */
    public String getHomeGround() {
        return homeGround;
    }

    /**
     * @param homeGround the homeGround to set
     */
    public void setHomeGround(String homeGround) {
        this.homeGround = homeGround;
    }

    /**
     * @return the numAirplanes
     */
    public int getNumAirplanes() {
        return numAirplanes;
    }

    /**
     * @param numAirplanes the numAirplanes to set
     */
    public void setNumAirplanes(int numAirplanes) {
        this.numAirplanes = numAirplanes;
    }
    
    @Override
    public String toString(){
        
        return this.getAirlinerName();
    }

    /**
     * @return the flights
     */
    public Flights getFlights() {
        return flights;
    }
//
//    /**
//     * @param flights the flights to set
//     */
    public void setFlights(Flights flights) {
        this.flights = flights;
    }
}
