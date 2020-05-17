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
public class GRNDTO extends SuperDTO{
    private String id;
    private BigDecimal unitPrice;
    private int qTY;
    private String supplierPaymentId;
    private String Date;

    public GRNDTO() {
    }

    public GRNDTO(String id, BigDecimal unitPrice, int qTY, String supplierPaymentId, String Date) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.qTY = qTY;
        this.supplierPaymentId = supplierPaymentId;
        this.Date = Date;
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
     * @return the unitPrice
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the qTY
     */
    public int getqTY() {
        return qTY;
    }

    /**
     * @param qTY the qTY to set
     */
    public void setqTY(int qTY) {
        this.qTY = qTY;
    }

    /**
     * @return the supplierPaymentId
     */
    public String getSupplierPaymentId() {
        return supplierPaymentId;
    }

    /**
     * @param supplierPaymentId the supplierPaymentId to set
     */
    public void setSupplierPaymentId(String supplierPaymentId) {
        this.supplierPaymentId = supplierPaymentId;
    }

    /**
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }
    
    
}
