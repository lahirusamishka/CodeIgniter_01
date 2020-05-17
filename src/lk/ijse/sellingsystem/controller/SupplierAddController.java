/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sellingsystem.controller;

import java.util.ArrayList;
import lk.ijse.sellingsystem.core.dto.SupplierDTO;
import lk.ijse.sellingsystem.dao.DAOFactory;
import lk.ijse.sellingsystem.dao.custom.SupplierDAO;

/**
 *
 * @author Samishka
 */
public class SupplierAddController {
    public static SupplierDAO supplierDAO=(SupplierDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SUPPLIER);

    public static boolean addSupplier(SupplierDTO supplier) throws Exception {
        boolean result = supplierDAO.add(supplier);

        return result;
    }
    public static boolean deleteCustomer(SupplierDTO supplier)throws Exception{
        boolean result = supplierDAO.delete(supplier);
        return result;
    }
    public static SupplierDTO searchCustomer(SupplierDTO supplier) throws Exception {
        SupplierDTO searchedCustomer = supplierDAO.search(supplier);
        return searchedCustomer;
    }
    public static boolean updateCustomer(SupplierDTO supplier)throws Exception{
        boolean result = supplierDAO.update(supplier);
        return result;
    }

    public static ArrayList<SupplierDTO> getAllCustomers() throws Exception {
        return supplierDAO.getAll();
    }



}
