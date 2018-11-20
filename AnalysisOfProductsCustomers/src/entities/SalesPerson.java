/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tanmayee Kalluri
 */
public class SalesPerson {
    private int salesId;
    private List<Order> orders;

    public SalesPerson(int salesId) {
       this.salesId = salesId;
       this.orders = new ArrayList<>();
    }

    /**
     * @return the salesId
     */
    public int getSalesId() {
        return salesId;
    }

    /**
     * @param salesId the salesId to set
     */
    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    /**
     * @return the orders
     */
    public List<Order> getOrders() {
        return orders;
    }

    /**
     * @param orders the orders to set
     */
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
    
}
