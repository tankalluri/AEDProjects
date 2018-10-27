package assignment.pkg2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import data.Product;
import data.Supplier;
/**
 *
 * @author Tanmayee Kalluri
 */
public class Assignment2 {
        
    public static void main(String[] args) throws Exception {
        Product p= new Product();
        Supplier supp = new Supplier();
        
        System.out.println("Enter product name: ");
        BufferedReader brName = new BufferedReader(new InputStreamReader(System.in));
        try {
            p.setName(brName.readLine());
        } catch (Exception ex) {
            System.out.println("Please enter something");
        }
        
        BufferedReader brPrice = new BufferedReader(new InputStreamReader(System.in));
        String pc = null;
        do{
            System.out.println("Enter product price: ");
        try {
            pc = brPrice.readLine();
            p.setPrice(Double.parseDouble(pc));
        } catch (NumberFormatException ex) {
            System.out.println("Please enter a valid value");
        }
        }while(!brPrice.readLine().isEmpty());
        
        BufferedReader brAvailNum = new BufferedReader(new InputStreamReader(System.in));
        do{
        try {
            System.out.println("Enter product availability to the nearest whole number: ");
            p.setAvailNum(Integer.parseInt(brAvailNum.readLine()));
        } catch (NumberFormatException ex) {
            System.out.println("Please enter a valid value");
        }
        }while(!brAvailNum.readLine().isEmpty());
        
        System.out.println("Enter product description: ");
        BufferedReader brDesc = new BufferedReader(new InputStreamReader(System.in));
        try {
            p.setDescription(brDesc.readLine());
        } catch (Exception ex) {
            System.out.println("Please enter a valid value");
        }
        
        BufferedReader supplierCode = new BufferedReader(new InputStreamReader(System.in));
        do{
        try {
            System.out.println("Enter supplier code: ");
            supp.setSupplier_code(Integer.parseInt(supplierCode.readLine()));
        } catch (NumberFormatException ex) {
            System.out.println("Please enter a valid value");
        }
        }while(!supplierCode.readLine().isEmpty());
        
        System.out.println("Enter supplier name: ");
        BufferedReader supplierName = new BufferedReader(new InputStreamReader(System.in));
        try {
            supp.setSupplier_name(supplierName.readLine());
        } catch (Exception ex) {
            System.out.println("Please enter a valid value");
            Logger.getLogger(Assignment2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Enter supplier description: ");
        BufferedReader supplierDesc = new BufferedReader(new InputStreamReader(System.in));
        try {
            supp.setSupplier_desc(supplierDesc.readLine());
        } catch (Exception ex) {
            System.out.println("Please enter a valid value");
            //Logger.getLogger(Assignment2.class.getName()).log(Level.SEVERE, null, ex);
        }
        p.setSupplier(supp);
        
        System.out.println();
        System.out.println("___________________________________________________________________________");
        System.out.println("Entered details are as follows:");
        System.out.println("Name: "+p.getName());
        System.out.println("Price: "+p.getPrice());
        System.out.println("Availability: "+p.getAvailNum());
        System.out.println("Description: "+p.getDescription());
        System.out.println("Supplier Code: "+p.getSupplier().getSupplier_code());
        System.out.println("Supplier Name: "+p.getSupplier().getSupplier_name());
        System.out.println("Supplier Description: "+p.getSupplier().getSupplier_desc());
        System.out.println("___________________________________________________________________________");
        
        
        System.out.println();
        BufferedReader name = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader brNameUpdate = new BufferedReader(new InputStreamReader(System.in));
        int flagName= 1;
        do{
        System.out.println("Do you want to update the name of the product?(y/n) ");
        String deciderName = brNameUpdate.readLine();
            if(deciderName.equals("y") || deciderName.equals("Y")){
                do{
                    flagName= 1;
                System.out.println("Enter the value to be updated for product name: ");
                try{
                p.setName(name.readLine());
                }
                catch(Exception n){
                    System.out.println("Invalid entry");
                }
                }while(!name.readLine().isEmpty());
            }
            else if(deciderName.equals("n") || deciderName.equals("N")){
                flagName = 1;
            }
            else if(!(deciderName.equals("y") || deciderName.equals("Y") || deciderName.equals("n") || deciderName.equals("N"))){
                System.out.println("Invalid input");
                flagName = 0;
            }
    }while(flagName == 0);
        
        System.out.println();       
        BufferedReader brPriceUpdate = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader price = new BufferedReader(new InputStreamReader(System.in));
        int flagPrice = 1;
        do{
        System.out.println("Do you want to update the price of the product?(y/n) ");
        String deciderPrice = brPriceUpdate.readLine();
                         if(deciderPrice.equals("y") || deciderPrice.equals("Y")){
                         do{
                          try{
                              flagPrice= 1;
                              System.out.println("Enter the value to be updated for product price:");
                              p.setPrice(Double.parseDouble(price.readLine()));
                              }
                          catch(NumberFormatException e){
                              System.out.print("Invalid entry \t");
                          }
                         }while(!(price.readLine().isEmpty()));
                         }
                         else if(deciderPrice.equals("n") || deciderPrice.equals("N")){
                             flagPrice = 1;
                             }
                         else if(!(deciderPrice.equals("y") || deciderPrice.equals("Y") || deciderPrice.equals("n") || deciderPrice.equals("N"))){
                            System.out.println("Invalid input");
                            flagPrice = 0;
                                }
    }while(flagPrice == 0);
                         
        System.out.println();
        BufferedReader brAvailUpdate = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader avail = new BufferedReader(new InputStreamReader(System.in));
        int flag =1;
        do{
        System.out.println("Do you want to update the availability of the product?(y/n) ");
        String deciderAvail= brAvailUpdate.readLine();
                                    if(deciderAvail.equals("y") || deciderAvail.equals("Y")){
                                        do{
                                            flag = 1;
                                        System.out.println("Enter the value to be updated for product availability to the nearest whole number:");
                                        try{
                                            p.setAvailNum(Integer.parseInt(avail.readLine()));
                                        }
                                        catch(NumberFormatException e){
                                            System.out.println("Invalid entry");
                                            
                                        }
                                        }while(!(avail.readLine().isEmpty()));
                                    }
                                    else if(deciderAvail.equals("n") || deciderAvail.equals("N")){
                                           flag = 1;
                                          }
                                    else if(!(deciderAvail.equals("y") || deciderAvail.equals("Y") || deciderAvail.equals("n") || deciderAvail.equals("N"))){
                                            flag = 0;
                                            System.out.println("Invalid entry");
                                        }
        }while(flag == 0);
        System.out.println();
        BufferedReader desc = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader brDescUpdate = new BufferedReader(new InputStreamReader(System.in)); 
        int flagDesc = 1;
        do{
        System.out.println("Do you want to update the description of the product?(y/n) ");
        String deciderDesc = brDescUpdate.readLine();
                                            if(deciderDesc.equals("y") || deciderDesc.equals("Y")){
                                                do{
                                                    flagDesc =1;
                                                System.out.println("Enter the value to be updated for product description:");
                                                try{
                                                p.setDescription(desc.readLine());
                                                }
                                                 catch(Exception n){
                                                 System.out.println("Invalid entry");
                                                     }
                                                }while(!(desc.readLine().isEmpty()));
                                            }
                                            else if(deciderDesc.equals("n") || deciderDesc.equals("N")){
                                                       flagDesc = 1;
                                                  }
                                            else if(!(deciderDesc.equals("y") || deciderDesc.equals("Y") || deciderDesc.equals("n") || deciderDesc.equals("N"))){
                                            System.out.println("Invalid input");
                                            flagDesc= 0;
                                                }
    }while(flagDesc == 0);
        
        System.out.println();
        BufferedReader code = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader suppCodeUpdate = new BufferedReader(new InputStreamReader(System.in));
        int flagCd = 1;
        do{
        System.out.println("Do you want to update the supplier code?(y/n) ");
        String suppCode = suppCodeUpdate.readLine();
            if(suppCode.equals("y") || suppCode.equals("Y")){
                do{
                    flagCd = 1;
                System.out.println("Enter the value to be updated for supplier code:");
                try{
                supp.setSupplier_code(Integer.parseInt(code.readLine()));
                }
                catch(NumberFormatException e){
                    System.out.println("Please enter a valid value");
                }
                }while(!code.readLine().isEmpty());
              }
            else if(suppCode.equals("n") || suppCode.equals("N")){
                    flagCd = 1;
            } 
            else if(!(suppCode.equals("y") || suppCode.equals("Y") || suppCode.equals("n") || suppCode.equals("N"))){
                    System.out.println("Invalid input");
                    flagCd = 0;
                     }
        }while(flagCd ==0);
            
        System.out.println();
        System.out.println("Do you want to update the supplier name?(y/n) ");
        int flagSuppName =1;
        do{
        BufferedReader suppNameUpdate = new BufferedReader(new InputStreamReader(System.in));
        String suppName = suppNameUpdate.readLine();
            if(suppName.equals("y") || suppName.equals("Y")){
                System.out.println("Enter the value to be updated for supplier name:");
                try{
                    flagSuppName =1;
                supp.setSupplier_name(suppNameUpdate.readLine());
                }
                catch(Exception n){
                    System.out.println("Please enter a valid value");
                }
              }
            else if(suppName.equals("n") || suppName.equals("N")){
                        flagSuppName = 1;
            }
            else if(!(suppName.equals("y") || suppName.equals("Y") || suppName.equals("n") || suppName.equals("N"))){
                    System.out.println("Invalid input");
                    flagSuppName =0;
                     }
    }while(flagSuppName == 0);
            
        System.out.println();
        BufferedReader suppDescUpdate = new BufferedReader(new InputStreamReader(System.in));
        int flagSuppDesc = 1;
        do{
        System.out.println("Do you want to update the supplier description?(y/n) ");
        String suppDesc = suppDescUpdate.readLine();
            if(suppDesc.equals("y") || suppDesc.equals("Y")){
                System.out.println("Enter the value to be updated for supplier name:");
                try{
                    flagSuppDesc=1;
                supp.setSupplier_desc(suppDescUpdate.readLine());
                }
                catch(Exception n){
                    System.out.println("Please enter a valid value");
                }
              }
            else if(suppDesc.equals("n") || suppDesc.equals("N")){
                     flagSuppDesc = 1;
            }
            else if(!(suppDesc.equals("y") || suppDesc.equals("Y") || suppDesc.equals("n") || suppDesc.equals("N"))){
                    System.out.println("Invalid input");
                    flagSuppDesc=0;
                     }
    }while(flagSuppDesc==0);
                                            
        p.setSupplier(supp);//set again after updating
        
        System.out.println("___________________________________________________________________________");
        System.out.println("New Values:");
        System.out.println("Name: "+p.getName());
        System.out.println("Price: "+p.getPrice());
        System.out.println("Availability: "+p.getAvailNum());
        System.out.println("Description: "+p.getDescription());
        System.out.println("Supplier Code: "+p.getSupplier().getSupplier_code());
        System.out.println("Supplier Name: "+p.getSupplier().getSupplier_name());
        System.out.println("Supplier Description: "+p.getSupplier().getSupplier_desc());
        System.out.println("___________________________________________________________________________");
        
        
    }
}


