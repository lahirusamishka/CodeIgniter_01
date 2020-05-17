/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sellingsystem.controller;

import java.util.ArrayList;

import lk.ijse.sellingsystem.core.dto.VehicleDTO;

import lk.ijse.sellingsystem.dao.DAOFactory;

import lk.ijse.sellingsystem.dao.custom.VehicleDAO;


/**
 *
 * @author Samishka
 */
public class VehicleController {

    public static VehicleDAO vehicleDAO = (VehicleDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.VEHICLE);

    public static boolean addVehicle(VehicleDTO vehicle) throws Exception{
        boolean result = vehicleDAO.add(vehicle);
        return result;
    }
    public static boolean deleteVehicle(VehicleDTO vehicle) throws Exception{
        boolean result = vehicleDAO.delete(vehicle);
        return result;
    }
    public static VehicleDTO searchVehicle(VehicleDTO vehicle) throws Exception{
        VehicleDTO searchedCustomer = vehicleDAO.search(vehicle);
        return searchedCustomer;
    }
    public static boolean updateVehicle(VehicleDTO vehicle)throws Exception{
        boolean result = vehicleDAO.update(vehicle);
        return result;
    }
       public static ArrayList<VehicleDTO> getAllVehicles() throws Exception {
        return vehicleDAO.getAll();
    }
}
