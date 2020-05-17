/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sellingsystem.core.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Samishka
 */
public class CustomerDTO extends SuperDTO{

    private String id;
    private String nic;
    private String name;
    private String address;
    private String phoneNo;
    private String vehicleId;
    private BigDecimal advance;
    private String date;
    private String email;

    public CustomerDTO() {
    }

    public CustomerDTO(String id, String nic, String name, String address, String phoneNo, String vehicleId, BigDecimal advance, String date, String email) {
        this.id = id;
        this.nic = nic;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.vehicleId = vehicleId;
        this.advance = advance;
        this.date = date;
        this.email = email;
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
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phoneNo
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * @param phoneNo the phoneNo to set
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
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
     * @return the advance
     */
    public BigDecimal getAdvance() {
        return advance;
    }

    /**
     * @param advance the advance to set
     */
    public void setAdvance(BigDecimal advance) {
        this.advance = advance;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

   
    
}
