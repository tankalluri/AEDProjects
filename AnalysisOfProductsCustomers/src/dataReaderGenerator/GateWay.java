package dataReaderGenerator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import entities.Customer;
import entities.Item;
import entities.Order;
import entities.Product;
import entities.SalesPerson;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author Tanmayee Kalluri
 */
public class GateWay {
    
    DataReader productReader;
    DataReader orderReader;
    AnalysisHelper helper;
    
    public GateWay() throws IOException{
        DataGenerator generator = DataGenerator.getInstance();
        orderReader = new DataReader(generator.getOrderFilePath());
        productReader = new DataReader(generator.getProductCataloguePath());
            }
    public static void main(String[] args) throws IOException {   
        AnalysisHelper helper= new AnalysisHelper();
        helper = new AnalysisHelper();
        GateWay inst = new GateWay();
        inst.readData();
        helper.top3Customers();
        helper.top3mostpopularproducts();
        helper.revenue();
        helper.top3BestSalesPersons();
        helper.profitForTheYear();
    }
    
    private Order readData() throws IOException{
        String[] row;
        while((row = productReader.getNextRow()) != null ){
            generateProduct(row);
        }
        while((row = orderReader.getNextRow()) != null ){
            Item item = generateItem(row);

           //Order order = generateOrder(row, item);

            
            Order order = generateOrder(row, item);
            
            generateCustomer(row, order);
            generateSalesPerson(row, order);
            
        }
        return null;
     
    }
    private void generateProduct(String[] row){
        int productId = Integer.parseInt(row[0]);
        int minPrice = Integer.parseInt(row[1]);
        int maxPrice = Integer.parseInt(row[2]);
        int targetPrice = Integer.parseInt(row[3]);
        Product product = new Product(productId, minPrice, maxPrice,targetPrice);
        DataStore.getInstance().getProducts().put(productId,product);
    }
    
    private void generateCustomer(String[] row, Order order){
        int customerId = Integer.parseInt(row[5]);
       

       Map<Integer,Customer> customers = DataStore.getInstance().getCustomers();
        if(customers.containsKey(customerId))
            customers.get(customerId).getOrders().add(order);
        
        else
        {
            Customer c = new Customer(customerId);
            c.getOrders().add(order);
            customers.put(customerId, c);
        }
      

       Customer customer = new Customer(customerId);
       DataStore.getInstance().getCustomers().put(customerId, customer);
       

    }
   
    private Order generateOrder(String[] row, Item item){
        int orderId = Integer.parseInt(row[0]);
        int customerId = Integer.parseInt(row[5]);
        Map<Integer, Order> orders = DataStore.getInstance().getOrders();
        if(orders.containsKey(orderId)){
            orders.get(orderId).getItem().add(item);
            return orders.get(orderId);
        }else{
            Order order = new Order(orderId, customerId);
            order.getItem().add(item);
            orders.put(orderId, order);
            return order;
        }

    }
    
    private Item generateItem(String[] row){
        int item_Id = Integer.parseInt(row[1]);
        int pro_Id = Integer.parseInt(row[2]);
        int sales_Id = Integer.parseInt(row[4]);
        int price = Integer.parseInt(row[6]);
        int quantity = Integer.parseInt(row[3]);
        Item item = new Item(item_Id, pro_Id, price, quantity, sales_Id);
        DataStore.getInstance().getItems().put(item_Id, item);
        return item;

    }
    
    private void generateSalesPerson(String[] row, Order order){
        
     int salesId = Integer.parseInt(row[4]);
       
     SalesPerson sp = new SalesPerson(salesId);
     DataStore.getInstance().getSalesperson().put(salesId, sp);
    }    
}
