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
import lk.ijse.sellingsystem.core.dto.PaymentDTO;
import lk.ijse.sellingsystem.dao.custom.PaymentDAO;

/**
 *
 * @author Samishka
 */
public class PaymentDAOImpl implements PaymentDAO{
@Override
    public boolean add(PaymentDTO payment) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Payment VALUES (?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, payment.getId());
        pstm.setObject(2, payment.getDate());
        pstm.setObject(3, payment.getPaymentId());
        
        
        
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(PaymentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(PaymentDTO payment) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM Payment WHERE id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, payment.getId());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public PaymentDTO search(PaymentDTO payment) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Payment WHERE id='" + payment.getId()+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new PaymentDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3));
                    
        }

        return null;
    }

    @Override
    public ArrayList<PaymentDTO> getAll() throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Payment";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<PaymentDTO> alCustomers = null;

        while (rst.next()) {
            if (alCustomers == null) {
                alCustomers = new ArrayList<>();
            }

            alCustomers.add(new PaymentDTO(
                   rst.getString(1),
                    rst.getString(2),
                    rst.getString(3))
                    
            );

        }

        return alCustomers;
    }
}
