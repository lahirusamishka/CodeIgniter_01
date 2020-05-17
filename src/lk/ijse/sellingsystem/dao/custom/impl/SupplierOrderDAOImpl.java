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
import lk.ijse.sellingsystem.core.dto.SupplierOrderDTO;
import lk.ijse.sellingsystem.dao.custom.SupplierOrderDAO;

/**
 *
 * @author Samishka
 */
public class SupplierOrderDAOImpl implements SupplierOrderDAO{
@Override
    public boolean add(SupplierOrderDTO supplierOrderDTO) throws Exception {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO SupplierOrder VALUES (?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, supplierOrderDTO.getId());
        pstm.setObject(2, supplierOrderDTO.getOrderDate());
        pstm.setObject(3, supplierOrderDTO.getSupplierId());
        
        
        
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(SupplierOrderDTO supplierOrderDTO) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE SupplierOrder SET name=?, address=?, salary=? WHERE id=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, supplierOrderDTO.getId());
        pstm.setObject(2, supplierOrderDTO.getOrderDate());
        pstm.setObject(3, supplierOrderDTO.getSupplierId());
       
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean delete(SupplierOrderDTO supplierOrderDTO) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM SupplierOrder WHERE id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, supplierOrderDTO.getId());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public SupplierOrderDTO search(SupplierOrderDTO supplierOrderDTO) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM SupplierOrder WHERE id='" + supplierOrderDTO.getId()+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new SupplierOrderDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3));
                    
        }

        return null;
    }

    @Override
    public ArrayList<SupplierOrderDTO> getAll() throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM SupplierOrder";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<SupplierOrderDTO> alSupplierOrders = null;

        while (rst.next()) {
            if (alSupplierOrders == null) {
                alSupplierOrders = new ArrayList<>();
            }

            alSupplierOrders.add(new SupplierOrderDTO(
                   rst.getString(1),
                    rst.getString(2),
                    rst.getString(3))
                    
            );

        }

        return alSupplierOrders;
    }
    
}
