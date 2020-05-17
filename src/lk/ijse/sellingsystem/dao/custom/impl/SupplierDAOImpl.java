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
import lk.ijse.sellingsystem.core.dto.SupplierDTO;
import lk.ijse.sellingsystem.dao.custom.SupplierDAO;

/**
 *
 * @author Samishka
 */
public class SupplierDAOImpl implements SupplierDAO{
@Override
    public boolean add(SupplierDTO supplier) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Supplier VALUES (?,?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, supplier.getNic());
        pstm.setObject(2, supplier.getName());
        pstm.setObject(3, supplier.getAddress());
        pstm.setObject(4, supplier.getPhoneNo());
        pstm.setObject(5, supplier.getEmail());
        
        
        
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(SupplierDTO supplier) throws Exception {
       
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE Supplier SET name=?, address=?, salary=? WHERE id=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, supplier.getNic());
        pstm.setObject(2, supplier.getName());
        pstm.setObject(3, supplier.getAddress());
        pstm.setObject(4, supplier.getPhoneNo());
        pstm.setObject(5, supplier.getEmail());
        
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean delete(SupplierDTO supplier) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM Supplier WHERE id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, supplier.getNic());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public SupplierDTO search(SupplierDTO supplier) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Supplier WHERE nic='" + supplier.getNic()+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new SupplierDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5));
                    
        }

        return null;
    }

    @Override
    public ArrayList<SupplierDTO> getAll() throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Supplier";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<SupplierDTO> alCustomers = null;

        while (rst.next()) {
            if (alCustomers == null) {
                alCustomers = new ArrayList<>();
            }

            alCustomers.add(new SupplierDTO(
                   rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5))
                    
            );

        }

        return alCustomers;
    }

    
}
