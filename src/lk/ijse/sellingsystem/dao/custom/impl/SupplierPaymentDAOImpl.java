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
import lk.ijse.sellingsystem.core.dto.SupplierPaymentDTO;
import lk.ijse.sellingsystem.dao.custom.SupplierPaymentDAO;

/**
 *
 * @author Samishka
 */
public class SupplierPaymentDAOImpl implements SupplierPaymentDAO{

   
    @Override
    public boolean add(SupplierPaymentDTO supplierPaymentDTO) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO SupplierPayment VALUES (?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, supplierPaymentDTO.getId());
        pstm.setObject(2, supplierPaymentDTO.getAmount());
        pstm.setObject(3, supplierPaymentDTO.getDate());
        
        
        
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(SupplierPaymentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(SupplierPaymentDTO supplierPaymentDTO) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM SupplierPayment WHERE id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, supplierPaymentDTO.getId());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public SupplierPaymentDTO search(SupplierPaymentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SupplierPaymentDTO> getAll() throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM SupplierPayment";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<SupplierPaymentDTO> alSupplierPayment = null;

        while (rst.next()) {
            if (alSupplierPayment == null) {
                alSupplierPayment = new ArrayList<>();
            }

            alSupplierPayment.add(new SupplierPaymentDTO(
                   rst.getString(1),
                    rst.getBigDecimal(2),
                    rst.getString(3))
                    
            );

        }

        return alSupplierPayment;
    }
    
}
