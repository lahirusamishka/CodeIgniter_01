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
import lk.ijse.sellingsystem.core.dto.BatchDTO;
import lk.ijse.sellingsystem.core.dto.CustomerDTO;
import lk.ijse.sellingsystem.dao.custom.BatchDAO;

/**
 *
 * @author Samishka
 */
public class BatchDAOImpl implements BatchDAO {

    @Override
    public boolean add(BatchDTO batch) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();

        String sql = "INSERT INTO Customer VALUES (?,?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, batch.getId());
        pstm.setObject(2, batch.getCustomerorderid());
        pstm.setObject(3, batch.getFueltype());
        pstm.setObject(4, batch.getVehicletype());
        pstm.setObject(5, batch.getVehicleBrand());

        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(BatchDTO batch) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE batch SET Customerorderid=?,Fueltype=?, Vehicletype=?, VehicleBrand=? WHERE id=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, batch.getCustomerorderid());
        pstm.setObject(2, batch.getFueltype());
        pstm.setObject(3, batch.getVehicletype());
        pstm.setObject(3, batch.getVehicleBrand());
        pstm.setObject(4, batch.getId());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);

    }

    @Override
    public boolean delete(BatchDTO batch) throws Exception {

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM Customer WHERE id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, batch.getId());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);

    }

    @Override
    public BatchDTO search(BatchDTO batch) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM batch WHERE id='" + batch.getId() + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new BatchDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
            );
        }

        return null;
    }

    @Override
    public ArrayList<BatchDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM batch";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<BatchDTO> alBatch = null;

        while (rst.next()) {
            if (alBatch == null) {
                alBatch = new ArrayList<>();
            }

            alBatch.add(new BatchDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
            ));
        }

        return alBatch;
    }

}
