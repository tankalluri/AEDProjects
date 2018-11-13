/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Tanmayee Kalluri
 */
public class Product {
    private int productId;
  //  private int salesId;
    private int maxPrice;
    private int minPrice;
    private int targetPrice;

   

    public Product(int productId, int minPrice, int maxPrice, int targetPrice) {
        this.productId = productId;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.targetPrice = targetPrice;
    }

    /**
     * @return the productId
     */
    public int getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    /**
     * @return the salesId
     */
//    public int getSalesId() {
//        return salesId;
//    }
//
//    /**
//     * @param salesId the salesId to set
//     */
//    public void setSalesId(int salesId) {
//        this.salesId = salesId;
//    }

    /**
     * @return the maxPrice
     */
    public int getMaxPrice() {
        return maxPrice;
    }

    /**
     * @param maxPrice the maxPrice to set
     */
    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    /**
     * @return the minPrice
     */
    public int getMinPrice() {
        return minPrice;
    }

    /**
     * @param minPrice the minPrice to set
     */
    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    /**
     * @return the targetPrice
     */
    public int getTargetPrice() {
        return targetPrice;
    }

    /**
     * @param targetPrice the targetPrice to set
     */
    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    }
    
}
