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
public class S_O_DDTO extends SuperDTO{
    private String id;
    private String date;
    private String vehicleId;
    private String supplierOrderId;

    public S_O_DDTO() {
    }

    public S_O_DDTO(String id, String date, String vehicleId, String supplierOrderId) {
        this.id = id;
        this.date = date;
        this.vehicleId = vehicleId;
        this.supplierOrderId = supplierOrderId;
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
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the vehicleId
     */
    public String getVehicleId() {
        return vehicleId;
    }

    /**
     * @param vehicleId the vehicleId to set
     */
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    /**
     * @return the supplierOrderId
     */
    public String getSupplierOrderId() {
        return supplierOrderId;
    }

    /**
     * @param supplierOrderId the supplierOrderId to set
     */
    public void setSupplierOrderId(String supplierOrderId) {
        this.supplierOrderId = supplierOrderId;
    }
    
    
    
}
