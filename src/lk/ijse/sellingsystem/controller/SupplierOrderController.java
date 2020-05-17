/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sellingsystem.controller;

import java.util.ArrayList;
import lk.ijse.sellingsystem.core.dto.SupplierOrderDTO;
import lk.ijse.sellingsystem.dao.DAOFactory;
import lk.ijse.sellingsystem.dao.custom.SupplierOrderDAO;

/**
 *
 * @author Samishka
 */
public class SupplierOrderController {
    public static SupplierOrderDAO supplierOrderDAO=(SupplierOrderDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SUPPLIERORDER);


    public static boolean addSupplierOrder(SupplierOrderDTO supplierOrder)throws Exception{
        boolean result=supplierOrderDAO.add(supplierOrder);
       return result;
    }
  public static boolean deleteCustomer(SupplierOrderDTO supplierOrder)throws Exception{
        boolean result = supplierOrderDAO.delete(supplierOrder);
        return result;
    }
    public static SupplierOrderDTO searchCustomer(SupplierOrderDTO supplierOrder) throws Exception {
        SupplierOrderDTO searchedCustomer = supplierOrderDAO.search(supplierOrder);
        return searchedCustomer;
    }
    public static boolean updateCustomer(SupplierOrderDTO supplierOrder)throws Exception{
        boolean result = supplierOrderDAO.update(supplierOrder);
        return result;
    }

    public static ArrayList<SupplierOrderDTO> getAllCustomers() throws Exception {
        return supplierOrderDAO.getAll();
    }

}
