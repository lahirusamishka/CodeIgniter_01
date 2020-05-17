/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sellingsystem.core.dto;

/**
 *
 * @author Samishka
 */
public class SupplierOrderDTO extends SuperDTO{
    private String id;
    private String orderDate;
    private String supplierId;

    public SupplierOrderDTO() {
    }

    public SupplierOrderDTO(String id, String orderDate, String supplierId) {
        this.id = id;
        this.orderDate = orderDate;
        this.supplierId = supplierId;
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
     * @return the orderDate
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @return the supplierId
     */
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * @param supplierId the supplierId to set
     */
    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }
    
}
