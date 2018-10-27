/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Tanmayee Kalluri
 */
public class Person {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String dob;
    private Address workAddress;
    private Address homeAddress;
    private Address otherAddress;

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
     * @return the streetAddress
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * @param streetAddress the streetAddress to set
     */
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
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
     * @return the workAddress
     */
    public Address getWorkAddress() {
        return workAddress;
    }

    /**
     * @param workAddress the workAddress to set
     */
    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    /**
     * @return the homeAddress
     */
    public Address getHomeAddress() {
        return homeAddress;
    }

    /**
     * @param homeAddress the homeAddress to set
     */
    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    /**
     * @return the otherAddress
     */
    public Address getOtherAddress() {
        return otherAddress;
    }

    /**
     * @param otherAddress the otherAddress to set
     */
    public void setOtherAddress(Address otherAddress) {
        this.otherAddress = otherAddress;
    }
    
          
}
