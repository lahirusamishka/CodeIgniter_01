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
public class VehicleDTO extends SuperDTO {

    private String id;
    private String Brand;
    private String Type;
    private BigDecimal Price;
    private String ManuYear;
    private String Color;
    private String description;

    public VehicleDTO() {
    }

    public VehicleDTO(String id, String Brand, String Type, BigDecimal Price, String ManuYear, String Color, String description) {
        this.id = id;
        this.Brand = Brand;
        this.Type = Type;
        this.Price = Price;
        this.ManuYear = ManuYear;
        this.Color = Color;
        this.description = description;
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
     * @return the Brand
     */
    public String getBrand() {
        return Brand;
    }

    /**
     * @param Brand the Brand to set
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * @return the Type
     */
    public String getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * @return the Price
     */
    public BigDecimal getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPrice(BigDecimal Price) {
        this.Price = Price;
    }

    /**
     * @return the ManuYear
     */
    public String getManuYear() {
        return ManuYear;
    }

    /**
     * @param ManuYear the ManuYear to set
     */
    public void setManuYear(String ManuYear) {
        this.ManuYear = ManuYear;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
}
