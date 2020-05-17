/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sellingsystem.controller;

import java.util.ArrayList;
import static lk.ijse.sellingsystem.controller.CustomerAddController.customerDAO;
import lk.ijse.sellingsystem.core.dto.CustomerDTO;
import lk.ijse.sellingsystem.core.dto.PaymentDTO;
import lk.ijse.sellingsystem.dao.DAOFactory;
import lk.ijse.sellingsystem.dao.custom.CustomerDAO;
import lk.ijse.sellingsystem.dao.custom.PaymentDAO;

/**
 *
 * @author Samishka
 */
public class CustomerPaymentController {

    public static PaymentDAO paymentDAO= (PaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENT);

    public static boolean addPayment(PaymentDTO payment) throws Exception {
        boolean result = paymentDAO.add(payment);

        return result;
    }

    public static boolean deletePayment(PaymentDTO payment) throws Exception {
        boolean result = paymentDAO.delete(payment);
        return result;
    }

    public static PaymentDTO searchPayment(PaymentDTO payment) throws Exception {
        PaymentDTO searchedCustomer = paymentDAO.search(payment);
        return searchedCustomer;
    }

    public static boolean updatePayment(PaymentDTO payment) throws Exception {
        boolean result = paymentDAO.update(payment);
        return result;
    }

    public static ArrayList<PaymentDTO> getAllCustomers() throws Exception {
        return paymentDAO.getAll();
    }

}
