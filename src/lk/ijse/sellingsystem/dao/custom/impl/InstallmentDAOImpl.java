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
import lk.ijse.sellingsystem.core.dto.GRNDTO;
import lk.ijse.sellingsystem.core.dto.InstallmentDTO;
import lk.ijse.sellingsystem.dao.custom.InstallmentDAO;

/**
 *
 * @author Samishka
 */
public class InstallmentDAOImpl implements InstallmentDAO {

    @Override
    public boolean add(InstallmentDTO installment) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();

        String sql = "INSERT INTO Installment VALUES (?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, installment.getId());
        pstm.setObject(2, installment.getPremiums());
        pstm.setObject(3, installment.getCustomerOrderId());
        pstm.setObject(4, installment.getPaymentTypeId());

        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);

    }

    @Override
    public boolean update(InstallmentDTO installment) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE installment premiums=?,customerorderid=?,paymenttypeid=? WHERE id=?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setObject(1, installment.getId());
        pstm.setObject(2, installment.getPremiums());
        pstm.setObject(3, installment.getCustomerOrderId());
        pstm.setObject(4, installment.getPaymentTypeId());

        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);

    }

    @Override
    public boolean delete(InstallmentDTO installment) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM installment WHERE id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1,installment.getId());
        
           int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public InstallmentDTO search(InstallmentDTO installment) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM installment WHERE id='" + installment.getId() + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        
        if (rst.next()) {
            return new InstallmentDTO(
                    rst.getString(1),
                    rst.getBigDecimal(2),
                    rst.getString(4),
                    rst.getString(4)
                    
                    );
        }
         return null;
    }

    @Override
    public ArrayList<InstallmentDTO> getAll() throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM installment";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<InstallmentDTO> installment = null;
        while (rst.next()) {
            if (installment == null) {
                installment = new ArrayList<>();
            }

            installment.add(new InstallmentDTO(
                    rst.getString(1),
                    rst.getBigDecimal(2),
               
                    rst.getString(4),
                    rst.getString(4)
                      ));
        }

        return installment;

        
    }

}
