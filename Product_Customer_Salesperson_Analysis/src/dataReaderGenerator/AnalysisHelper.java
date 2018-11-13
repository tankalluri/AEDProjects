/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataReaderGenerator;

import entities.Item;
import entities.Order;
import entities.Product;
import entities.SalesPerson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Tanmayee Kalluri
 */
public class AnalysisHelper {
    
    public void top3Customers(){
       Map<Integer, Integer> top3customers = new HashMap<Integer, Integer>();
       Map<Integer, Order> orders = DataStore.getInstance().getOrders();
        for(Order o :orders.values()){
            for(Item i : o.getItem()){
                if(top3customers.containsKey(o.getCustomerId())){
                 int cumulative= top3customers.get(o.getCustomerId());
                 cumulative =cumulative+i.getQuantity()*i.getSalesPrice();
                top3customers.put(o.getCustomerId(), cumulative);
            }
                else{
                top3customers.put(o.getCustomerId(), i.getQuantity()*i.getSalesPrice());
                }
            }
        }
        List<Map.Entry<Integer, Integer>> customerList = new ArrayList<Map.Entry<Integer, Integer>>(top3customers.entrySet());
         Collections.sort(customerList, new Comparator<Map.Entry<Integer, Integer>>() {
         @Override
         public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
             return o2.getValue().compareTo(o1.getValue());
         }
      });
         int count=0;
        System.out.println("_________________________________________________");
        System.out.println("Top 3 customers");
//      for(Map.Entry<Integer, Integer> customer: customerList ){
//          if(count<3)
//          System.out.println("inside list");
//          System.out.println("Customer ID: "+customer.getKey() + " Total purchase amount:"+customer.getValue());
//          count++;
//      }       
      for(int i=0;i<3;i++){
          Map.Entry<Integer, Integer> customer = customerList.get(i);
          System.out.println("Customer ID: "+customer.getKey() + " Total purchase amount:"+customer.getValue());
      }
//        Iterator<Map.Entry<Integer, Integer>> iterator = top3customers.entrySet().iterator();
//        while(iterator.hasNext()){
//            Map.Entry<Integer, Integer> customer = iterator.next();
//            System.out.println("Customer ID: "+customer.getKey() + " Total purchase amount:"+customer.getValue());
//        }
       
   }
    
    public void top3mostpopularproducts()
    {
       Map<Integer, Integer> top3mostpopularproducts = new HashMap<Integer, Integer>();
       Map<Integer, Order> orders = DataStore.getInstance().getOrders();
       
       for(Order o :orders.values()){
           
           for(Item Item: o.getItem())
           { 
               if(top3mostpopularproducts.containsKey(Item.getProductId())){
                   
                int overall= top3mostpopularproducts.get(Item.getProductId());
                overall =overall+Item.getQuantity()*Item.getSalesPrice();
                top3mostpopularproducts.put(Item.getProductId(), overall);
                   
               }
               else{
                top3mostpopularproducts.put(Item.getProductId(), Item.getQuantity()*Item.getSalesPrice());
                }
           }
       }
           
         List<Map.Entry<Integer, Integer>> productsList = new ArrayList<Map.Entry<Integer, Integer>>(top3mostpopularproducts.entrySet());
         Collections.sort(productsList, new Comparator<Map.Entry<Integer, Integer>>() {
         @Override
         public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
             return o2.getValue().compareTo(o1.getValue());
         }
      });

        System.out.println("_________________________________________________");
        System.out.println("Top 3 most popular products sorted high to low");
       
       
       for(int i=0;i<3;i++){
          Map.Entry<Integer, Integer> product = productsList.get(i);
          System.out.println("Product ID: "+product.getKey() + " Total purchase amount:"+product.getValue());
      }
    }
    
    public void revenue(){
       Map<Integer, Order> orders = DataStore.getInstance().getOrders();
       Map<Integer, Item> items = DataStore.getInstance().getItems();
       int revenue=0;
        for(Order o :orders.values()){
           for(Item item: o.getItem())
           {
               revenue+= item.getQuantity()*item.getSalesPrice();
             }
            }
             System.out.println("_________________________________________________");
             System.out.println("Total revenue for the year");
             System.out.println(revenue);  
             System.out.println("_________________________________________________");
             }

    public void top3BestSalesPersons(){
        Map<Integer, SalesPerson> salesPersons = DataStore.getInstance().getSalesperson();
        Map<Integer, Item> items = DataStore.getInstance().getItems();
        
        Map<Integer, Integer> soldItemsBySales = new HashMap<Integer, Integer>();
        
        for(SalesPerson sp : salesPersons.values()){
            int value = 0;
            for(Item item : items.values()){
                if(item.getSalesId() == sp.getSalesId()){
                     value += item.getQuantity() * item.getSalesPrice();
                }

            }
            soldItemsBySales.put(sp.getSalesId(), value);
        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(soldItemsBySales.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){

            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        
        });

        System.out.println("Top 3 sales person");
        Iterator it = list.iterator();
        int size = 0;
        while(it.hasNext() && size < 3){
            Map.Entry salesPerson = (Map.Entry) it.next();
            System.out.println("Sales Person Id: " +salesPerson.getKey() + " Total amount sold by person :" +salesPerson.getValue());
            size++;
        }
        
    }
    
    public void profitForTheYear(){
       Map<Integer, Item> items = DataStore.getInstance().getItems();
       Map<Integer, Product> products = DataStore.getInstance().getProducts();
       int profit=0;
        for(Item item :items.values()){
           if(products.containsKey(item.getProductId())){
               Product product = products.get(item.getProductId());
               profit += (item.getSalesPrice() - product.getMinPrice()) * item.getQuantity();
           }
             
        }
        System.out.println("_________________________________________________");
        System.out.println("Total revenue/profit for the year");
        System.out.println(profit);  
        System.out.println("_________________________________________________");
        }
}
    
    

    
    

