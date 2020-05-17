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
import lk.ijse.sellingsystem.dao.custom.GRNDAO;

/**
 *
 * @author Samishka
 */
public class GRNDAOImpl implements GRNDAO {

    @Override
    public boolean add(GRNDTO grn) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();

        String sql = "INSERT INTO Customer VALUES (?,?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, grn.getId());
        pstm.setObject(2, grn.getId());
        pstm.setObject(3, grn.getUnitPrice());
        pstm.setObject(4, grn.getqTY());
        pstm.setObject(5, grn.getDate());

        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);

    }

    @Override
    public boolean update(GRNDTO grn) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE grn unitprice=?,gty=?,supplierpaymentid=?,date=? WHERE id=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, grn.getUnitPrice());
        pstm.setObject(2, grn.getqTY());
        pstm.setObject(3, grn.getSupplierPaymentId());
        pstm.setObject(4, grn.getDate());
        pstm.setObject(5, grn.getId());

        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean delete(GRNDTO grn) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM grn WHERE id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1,grn.getId());
        
           int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);

       
    }

    @Override
    public GRNDTO search(GRNDTO grn) throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM grn WHERE id='" + grn.getId() + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        
        if (rst.next()) {
            return new GRNDTO(
                    rst.getString(1),
                    rst.getBigDecimal(2),
                    rst.getInt(3),
                    rst.getString(4),
                    rst.getString(4)
                    
                    );
        }
         return null;
        
    }

    @Override
    public ArrayList<GRNDTO> getAll() throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM grn";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
         ArrayList<GRNDTO> alGRN = null;
        while (rst.next()) {
            if (alGRN == null) {
                alGRN = new ArrayList<>();
            }

            alGRN.add(new GRNDTO(
                    rst.getString(1),
                    rst.getBigDecimal(2),
                    rst.getInt(3),
                    rst.getString(4),
                    rst.getString(4)
                      ));
        }

        return alGRN;
       
    }

}
