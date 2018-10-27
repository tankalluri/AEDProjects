/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 0*
 * @author Tanny
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String dob;
    private String phNum;
    private String id;
    private int price; 
    private Flights flightDetails;

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the phNum
     */
    public String getPhNum() {
        return phNum;
    }

    /**
     * @param phNum the phNum to set
     */
    public void setPhNum(String phNum) {
        this.phNum = phNum;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the flightDetails
     */
    public Flights getFlightDetails() {
        return flightDetails;
    }

    /**
     * @param flightDetails the flightDetails to set
     */
    public void setFlightDetails(Flights flightDetails) {
        this.flightDetails = flightDetails;
    }
    
}
