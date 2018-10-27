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
public class AirlineDirectory {
    private List<Airlines> airlineDir;
    private FlightDirectory flightdir;
    private Flights f;
    public AirlineDirectory(){
        airlineDir = new ArrayList<Airlines>();
    }

    /**
     * @return the airlineDir
     */
    public List<Airlines> getAirlineDir() {
        return airlineDir;
    }

    /**
     * @param airlineDir the airlineDir to set
     */
    public void setAirlineDir(List<Airlines> airlineDir) {
        this.airlineDir = airlineDir;
    }
    public Airlines addAirline(){
        Airlines a = new Airlines();
        getAirlineDir().add(a);
        return a;
    }
    
    public Airlines removeAirline(Airlines a){
        getAirlineDir().remove(a);
        return a;
    }

    /**
     * @return the flightdir
     */
    public FlightDirectory getFlightdir() {
        return flightdir;
    }

    /**
     * @param flightdir the flightdir to set
     */
    public void setFlightdir(FlightDirectory flightdir) {
        this.flightdir = flightdir;
    }

    /**
     * @return the f
     */
    public Flights getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(Flights f) {
        this.f = f;
    }
}
