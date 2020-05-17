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
import lk.ijse.sellingsystem.dao.custom.CustomerDAO;
import lk.ijse.sellingsystem.view.CustomerAdd;

/**
 *
 * @author Samishka
 */
public class CustomerDAOImpl implements CustomerDAO {
     private Connection connection;
    @Override
    public boolean add(CustomerDTO customer) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();

        String sql = "INSERT INTO Customer VALUES (?,?,?,?,?,?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, customer.getId());
        pstm.setObject(2, customer.getNic());
        pstm.setObject(3, customer.getName());
        pstm.setObject(4, customer.getAddress());
        pstm.setObject(5, customer.getPhoneNo());
        pstm.setObject(6, customer.getVehicleId());
        pstm.setObject(7, customer.getAdvance());
        pstm.setObject(8, customer.getDate());
        pstm.setObject(9, customer.getEmail());

        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(CustomerDTO customer) throws Exception {
       Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE Customer SET name=?, address=?, salary=? WHERE id=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, customer.getNic());
        pstm.setObject(2, customer.getName());
        pstm.setObject(3, customer.getAddress());
        pstm.setObject(4, customer.getId());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);

    }

    @Override
    public boolean delete(CustomerDTO customer) throws Exception {
          Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM Customer WHERE id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, customer.getId());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public CustomerDTO search(CustomerDTO customer) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Customer WHERE id='" + customer.getId() + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new CustomerDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getBigDecimal(7),
                    rst.getString(8),
                    rst.getString(9)
            );
        }

        return null;
    }

    @Override
    public ArrayList<CustomerDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Customer";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<CustomerDTO> alCustomers = null;

        while (rst.next()) {
            if (alCustomers == null) {
                alCustomers = new ArrayList<>();
            }

            alCustomers.add(new CustomerDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getBigDecimal(7),
                    rst.getString(8),
                    rst.getString(9)
            ));
        }

        return alCustomers;
    }

    @Override
    public ArrayList<String> getAllCourseID() throws Exception {
       String sql = "SELECT  id from customer";

         Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<String> cidList = new ArrayList<>();
        while (rst.next()) {
            cidList.add(rst.getString("id"));
        }
        return cidList;
    }
 }


