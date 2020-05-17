/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sellingsystem.core.dto;

import java.math.BigDecimal;

/**
 *
 * @author Samishka
 */
public class InstallmentDTO extends SuperDTO{
    private String id;
    private BigDecimal premiums;
    private String customerOrderId;
    private String paymentTypeId;

    public InstallmentDTO() {
    }

    public InstallmentDTO(String id, BigDecimal premiums, String customerOrderId, String paymentTypeId) {
        this.id = id;
        this.premiums = premiums;
        this.customerOrderId = customerOrderId;
        this.paymentTypeId = paymentTypeId;
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
     * @return the premiums
     */
    public BigDecimal getPremiums() {
        return premiums;
    }

    /**
     * @param premiums the premiums to set
     */
    public void setPremiums(BigDecimal premiums) {
        this.premiums = premiums;
    }

    /**
     * @return the customerOrderId
     */
    public String getCustomerOrderId() {
        return customerOrderId;
    }

    /**
     * @param customerOrderId the customerOrderId to set
     */
    public void setCustomerOrderId(String customerOrderId) {
        this.customerOrderId = customerOrderId;
    }

    /**
     * @return the paymentTypeId
     */
    public String getPaymentTypeId() {
        return paymentTypeId;
    }

    /**
     * @param paymentTypeId the paymentTypeId to set
     */
    public void setPaymentTypeId(String paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }
    
    
    
}
