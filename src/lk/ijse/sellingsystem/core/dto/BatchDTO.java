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
public class BatchDTO extends SuperDTO{
    private String id;
    private String customerorderid;
    private String fueltype;
    private String vehicletype;
    private String vehicleBrand;

    public BatchDTO() {
    }

    public BatchDTO(String id, String customerorderid, String fueltype, String vehicletype, String vehicleBrand) {
        this.id = id;
        this.customerorderid = customerorderid;
        this.fueltype = fueltype;
        this.vehicletype = vehicletype;
        this.vehicleBrand = vehicleBrand;
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
     * @return the customerorderid
     */
    public String getCustomerorderid() {
        return customerorderid;
    }

    /**
     * @param customerorderid the customerorderid to set
     */
    public void setCustomerorderid(String customerorderid) {
        this.customerorderid = customerorderid;
    }

    /**
     * @return the fueltype
     */
    public String getFueltype() {
        return fueltype;
    }

    /**
     * @param fueltype the fueltype to set
     */
    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    /**
     * @return the vehicletype
     */
    public String getVehicletype() {
        return vehicletype;
    }

    /**
     * @param vehicletype the vehicletype to set
     */
    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

    /**
     * @return the vehicleBrand
     */
    public String getVehicleBrand() {
        return vehicleBrand;
    }

    /**
     * @param vehicleBrand the vehicleBrand to set
     */
    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }
    
   
}
