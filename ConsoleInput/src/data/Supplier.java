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
public class Supplier {
    private String supplier_name;
    private String supplier_desc;
    private int supplier_code;

    /**
     * @return the supplier_name
     */
    public String getSupplier_name() {
        return supplier_name;
    }

    /**
     * @param supplier_name the supplier_name to set
     */
    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    /**
     * @return the supplier_desc
     */
    public String getSupplier_desc() {
        return supplier_desc;
    }

    /**
     * @param supplier_desc the supplier_desc to set
     */
    public void setSupplier_desc(String supplier_desc) {
        this.supplier_desc = supplier_desc;
    }

    /**
     * @return the supplier_code
     */
    public int getSupplier_code() {
        return supplier_code;
    }

    /**
     * @param supplier_code the supplier_code to set
     */
    public void setSupplier_code(int supplier_code) {
        this.supplier_code = supplier_code;
    }
}
