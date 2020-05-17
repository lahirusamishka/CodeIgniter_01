/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sellingsystem.controller;

import java.util.ArrayList;
import lk.ijse.sellingsystem.core.dto.PaymentTypeDTO;
import lk.ijse.sellingsystem.dao.DAOFactory;
import lk.ijse.sellingsystem.dao.custom.PaymentTypeDAO;


/**
 *
 * @author Samishka
 */
public class PaymentTypeController {
    
    public static PaymentTypeDAO paymentTypeDAO =(PaymentTypeDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENTTYPE);
    
    public static boolean addPaymentType(PaymentTypeDTO customer) throws  Exception  {
        boolean result = paymentTypeDAO.add(customer);
        return result;
}


    
    
    
    public static boolean deletePaymentType(PaymentTypeDTO customer)throws Exception{
        boolean result = paymentTypeDAO.delete(customer);
        return result;
    }
    
    
        public static ArrayList<PaymentTypeDTO> getAllPaymentType()throws Exception{
        return paymentTypeDAO.getAll();
    }
    
}
