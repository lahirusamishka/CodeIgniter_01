/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sellingsystem.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.sellingsystem.core.db.DBConnection;
import lk.ijse.sellingsystem.core.dto.PaymentDTO;
import lk.ijse.sellingsystem.core.dto.PaymentTypeDTO;
import lk.ijse.sellingsystem.dao.DAOFactory;
import lk.ijse.sellingsystem.dao.custom.PaymentDAO;
import lk.ijse.sellingsystem.dao.custom.PaymentTypeDAO;

/**
 *
 * @author Tharaka
 */
public class PaymentController {

    public static PaymentDAO paymentDAO = (PaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENT);
    public static PaymentTypeDAO paymentTypeDAO = (PaymentTypeDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENTTYPE);
    private static Connection conn = DBConnection.getInstance().getConnection();

    public static boolean addPayment(PaymentDTO paymentDTO) throws Exception {
        boolean result = paymentDAO.add(paymentDTO);
        return result;
    }

    public static boolean deletePayment(PaymentDTO paymentDTO) throws Exception {
        boolean result = paymentDAO.delete(paymentDTO);
        return result;
    }

    public static ArrayList<PaymentDTO> getAllPayment() throws Exception {
        return paymentDAO.getAll();
    }

    public static boolean addPayment(PaymentDTO paymentDTO, PaymentTypeDTO paymentTypeDTO) throws Exception {
        try {
            conn.setAutoCommit(false);
            boolean addPaymentType = paymentTypeDAO.add(paymentTypeDTO);
            if (!addPaymentType) {
                conn.rollback();;
                return false;
            }

            boolean addPaymnt = paymentDAO.add(paymentDTO);
            if (!addPaymnt) {
                conn.rollback();
                return false;
            }
            
            conn.commit();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(PaymentController.class.getName()).log(Level.SEVERE, null, ex);
            conn.rollback();
            return false;
        }finally{
        conn.setAutoCommit(true);
        }

    }

}
