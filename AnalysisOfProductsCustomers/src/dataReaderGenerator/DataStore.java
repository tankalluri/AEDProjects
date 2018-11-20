/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataReaderGenerator;

import entities.Customer;
import entities.Item;
import entities.Order;
import entities.Product;
import entities.SalesPerson;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Tanmayee Kalluri
 */
public class DataStore {
    
    private static DataStore dataStore;
    
    private Map<Integer, Item> items;
    private Map<Integer, Order> orders;
    private Map<Integer, Customer> customers;
    private Map<Integer, Product> products;
    private Map<Integer, SalesPerson>salesperson;

    public Map<Integer, SalesPerson> getSalesperson() {
        return salesperson;
    }

    public void setSalesperson(Map<Integer, SalesPerson> salesperson) {
        this.salesperson = salesperson;
    }

    public Map<Integer, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, Product> products) {
        this.products = products;
    }
    
    private DataStore(){
        items = new HashMap<>();
        orders = new HashMap<>();
        customers = new HashMap<>();
        products = new HashMap<>();
        salesperson = new HashMap<>();
    }
    
    public static DataStore getInstance(){
        if(getDataStore() == null)
            setDataStore(new DataStore());
        return getDataStore();
    }

    public static DataStore getDataStore() {
        return dataStore;
    }

    public static void setDataStore(DataStore dataStore) {
        DataStore.dataStore = dataStore;
    }

    /**
     * @return the items
     */
    public Map<Integer, Item> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(Map<Integer, Item> items) {
        this.items = items;
    }

    /**
     * @return the orders
     */
    public Map<Integer, Order> getOrders() {
        return orders;
    }

    /**
     * @param orders the orders to set
     */
    public void setOrders(Map<Integer, Order> orders) {
        this.orders = orders;
    }

    /**
     * @return the customers
     */
    public Map<Integer, Customer> getCustomers() {
        return customers;
    }

    /**
     * @param customers the customers to set
     */
    public void setCustomers(Map<Integer, Customer> customers) {
        this.customers = customers;
    }


}

