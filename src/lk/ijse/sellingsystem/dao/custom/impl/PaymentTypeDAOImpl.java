/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sellingsystem.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.sellingsystem.core.db.DBConnection;
import lk.ijse.sellingsystem.core.dto.PaymentTypeDTO;
import lk.ijse.sellingsystem.dao.custom.PaymentTypeDAO;

/**
 *
 * @author Samishka
 */
public class PaymentTypeDAOImpl implements PaymentTypeDAO {

    @Override
    public boolean add(PaymentTypeDTO dto) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO PaymentType VALUES (?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, dto.getId());
        pstm.setObject(2, dto.getType());
        
        
        
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(PaymentTypeDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(PaymentTypeDTO dto) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM PaymentType WHERE id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, dto.getId());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

   @Override
   public PaymentTypeDTO search(PaymentTypeDTO dto) throws Exception {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<PaymentTypeDTO> getAll() throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM PaymentType";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<PaymentTypeDTO> alCustomers = null;

        while (rst.next()) {
            if (alCustomers == null) {
                alCustomers = new ArrayList<>();
            }

            alCustomers.add(new PaymentTypeDTO(
                   rst.getString(1),
                    rst.getString(2))
                    
            );

        }

        return alCustomers;
    }
}
    