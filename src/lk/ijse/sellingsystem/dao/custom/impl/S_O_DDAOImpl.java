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
import lk.ijse.sellingsystem.core.dto.S_O_DDTO;
import lk.ijse.sellingsystem.dao.custom.S_O_DDAO;

/**
 *
 * @author Samishka
 */
public class S_O_DDAOImpl implements S_O_DDAO{

    
    @Override
    public boolean add(S_O_DDTO s_o_d) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO SOD VALUES (?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, s_o_d.getId());
        pstm.setObject(2, s_o_d.getDate());
        pstm.setObject(3, s_o_d.getVehicleId());
        pstm.setObject(4, s_o_d.getSupplierOrderId());
        
        
        
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(S_O_DDTO s_o_d) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE SOD SET supplierorderid=?, vehicleid=?, date=? WHERE id=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, s_o_d.getSupplierOrderId());
        pstm.setObject(2, s_o_d.getVehicleId());
        pstm.setObject(3, s_o_d.getDate());
        pstm.setObject(4, s_o_d.getId());
        
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean delete(S_O_DDTO S_O_D) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM SOD WHERE id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, S_O_D.getId());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public S_O_DDTO search(S_O_DDTO s_o_d) throws Exception {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM SOD WHERE id='" + s_o_d.getId()+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new S_O_DDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4));
                    
        }

        return null;
    }

    @Override
    public ArrayList<S_O_DDTO> getAll() throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Sod";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<S_O_DDTO> alSod = null;

        while (rst.next()) {
            if (alSod == null) {
                alSod = new ArrayList<>();
            }

            alSod.add(new S_O_DDTO(
                   rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4))
                    
            );

        }

        return alSod;
    }
    
}
