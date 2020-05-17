/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sellingsystem.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.sellingsystem.core.db.DBConnection;
import lk.ijse.sellingsystem.core.dto.CustomerDTO;
import lk.ijse.sellingsystem.core.dto.VehicleDTO;
import lk.ijse.sellingsystem.dao.custom.VehicleDAO;

/**
 *
 * @author Samishka
 */
public class VehicleDAOImpl implements VehicleDAO{

    @Override
    public boolean add(VehicleDTO vehicle) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql="INSERT INTO vehicle VALUES(?,?,?,?,?,?,?);";
        PreparedStatement pstm=connection.prepareStatement(sql);
        pstm.setObject(1,vehicle.getId());
        pstm.setObject(2,vehicle.getBrand());
        pstm.setObject(3,vehicle.getType());
        pstm.setObject(4,vehicle.getPrice());
        pstm.setObject(5,vehicle.getManuYear());
        pstm.setObject(6,vehicle.getColor());
        pstm.setObject(7,vehicle.getDescription());

        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(VehicleDTO vehicleDTO) throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE Vehicle SET name=?, address=?, salary=? WHERE id=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, vehicleDTO.getId());
        pstm.setObject(2, vehicleDTO.getColor());
        pstm.setObject(3, vehicleDTO.getBrand());
        
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean delete(VehicleDTO vehicleDTO) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM Vehicle WHERE id = ?";
       PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, vehicleDTO.getId());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public VehicleDTO search(VehicleDTO vehicle) throws Exception {
        Connection connection=DBConnection.getInstance().getConnection();
        String sql="SELECT * FROM Vehicle WHERE Id='"+vehicle.getId()+"'";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        
        if(rst.next()){
            return new VehicleDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getBigDecimal(4),
                     rst.getString(5),
                     rst.getString(6),
                     rst.getString(7)
                    
            );
        }
        
        return null;
        
    }

    @Override
    public ArrayList<VehicleDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM vehicle";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<VehicleDTO> alVehicles = null;

        while (rst.next()) {
            if (alVehicles == null) {
                alVehicles = new ArrayList<>();
            }

            alVehicles.add(new VehicleDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getBigDecimal(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7)
                    
            ));
        }

        return alVehicles;
    

    }

    
}
