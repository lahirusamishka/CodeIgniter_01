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
import lk.ijse.sellingsystem.core.dto.CustomerOrderDTO;
import lk.ijse.sellingsystem.dao.custom.CustomerOrderDAO;

/**
 *
 * @author Samishka
 */
public class CustomerOrderDAOImpl implements CustomerOrderDAO{

    @Override
    public boolean add(CustomerOrderDTO customerorder) throws Exception {
        Connection connection=DBConnection.getInstance().getConnection();
        
        String sql="INSERT INTO Customerorders VALUES (?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
         pstm.setObject(1, customerorder.getId());
        pstm.setObject(2, customerorder.getOrderDate());
        pstm.setObject(3, customerorder.getCustomerId());
        
         int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
       
    }

    @Override
    public boolean update(CustomerOrderDTO customerorder) throws Exception {
           Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE Customerorders orderdate=?, customerId=? WHERE id=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
          pstm.setObject(1, customerorder.getOrderDate());
        pstm.setObject(2, customerorder.getCustomerId());
        pstm.setObject(3, customerorder.getId());

        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
       
    }

    @Override
    public boolean delete(CustomerOrderDTO customerorder) throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM Customerorders WHERE id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1,customerorder.getId());
       
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
        
    }

    @Override
    public CustomerOrderDTO search(CustomerOrderDTO customerorder) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Customerorders WHERE id='" + customerorder.getId() + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        
        if (rst.next()) {
            return new CustomerOrderDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3)
                    
                    );
        }
         return null;
   
    }

    @Override
    public ArrayList<CustomerOrderDTO> getAll() throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Customerorders";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        
         ArrayList<CustomerOrderDTO> alCustomerorders = null;
         
         while (rst.next()) {
            if (alCustomerorders == null) {
                alCustomerorders = new ArrayList<>();
            }

            alCustomerorders.add(new CustomerOrderDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3)
                      ));
        }

        return alCustomerorders;
                    
       
    }
    
}
