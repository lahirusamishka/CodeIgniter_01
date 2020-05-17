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
public class CustomerOrderDTO extends SuperDTO{
    private String id;
    private String orderDate;
    private String customerId;

    public CustomerOrderDTO() {
    }

    public CustomerOrderDTO(String id, String orderDate, String customerId) {
        this.id = id;
        this.orderDate = orderDate;
        this.customerId = customerId;
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
     * @return the customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    
    
}
