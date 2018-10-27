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
public class CustomerDirectory {
    private List<Customer> customerList;
    public CustomerDirectory(){
       customerList= new ArrayList<Customer>();
    }

    /**
     * @return the customerList
     */
    public List<Customer> getCustomerList() {
        return customerList;
    }

    /**
     * @param customerList the customerList to set
     */
    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer addCustomer(){
        Customer cust = new Customer();
        getCustomerList().add(cust);
        return cust;
    }
    
    public void removeCustomer(Customer cust){
        getCustomerList().remove(cust);
    }
}
