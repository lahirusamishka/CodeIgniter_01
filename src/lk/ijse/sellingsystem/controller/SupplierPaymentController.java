/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sellingsystem.controller;

import java.util.ArrayList;
import lk.ijse.sellingsystem.core.dto.SupplierPaymentDTO;
import lk.ijse.sellingsystem.dao.DAOFactory;
import lk.ijse.sellingsystem.dao.custom.SupplierPaymentDAO;

/**
 *
 * @author Samishka
 */
public class SupplierPaymentController {
   
    public static SupplierPaymentDAO supplierPaymentDAO = (SupplierPaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SUPPLIERPAYMENT);
    
    public static boolean addSupplierPayment(SupplierPaymentDTO supplierPaymentDTO) throws  Exception  {
        boolean result = supplierPaymentDAO.add(supplierPaymentDTO);
        return result;
}


    
    
    
    public static boolean deleteSupplierPayment(SupplierPaymentDTO supplierPaymentDTO)throws Exception{
        boolean result = supplierPaymentDAO.delete(supplierPaymentDTO);
        return result;
    }
    
    public static boolean updateSupplierPayment(SupplierPaymentDTO supplierPaymentDTO)throws Exception{
        boolean result = supplierPaymentDAO.update(supplierPaymentDTO);
        return result;
    }
    
    public static SupplierPaymentDTO searchSupplierPayment(SupplierPaymentDTO customer) throws Exception{
        SupplierPaymentDTO searchedCustomer = supplierPaymentDAO.search(customer);
        return searchedCustomer;
    } 
        public static ArrayList<SupplierPaymentDTO> getAllSupplierPayment()throws Exception{
        return supplierPaymentDAO.getAll();
    }
}
