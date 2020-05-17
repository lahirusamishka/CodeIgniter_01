/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sellingsystem.controller;

import com.sun.jmx.remote.util.OrderClassLoaders;
import java.util.ArrayList;
import lk.ijse.sellingsystem.core.dto.CustomerDTO;
import lk.ijse.sellingsystem.core.dto.CustomerOrderDTO;
import lk.ijse.sellingsystem.dao.DAOFactory;
import lk.ijse.sellingsystem.dao.custom.CustomerOrderDAO;

/**
 *
 * @author Samishka
 */
public class CustomerOrderController {
   public static CustomerOrderDAO customerDAO= (CustomerOrderDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMERORDER);

   public static boolean addCustomer(CustomerOrderDTO customer) throws Exception {
        boolean result = customerDAO.add(customer);

        return result;
    }
    public static boolean deleteCustomer(CustomerOrderDTO customer)throws Exception{
        boolean result = customerDAO.delete(customer);
        return result;
    }
    public static CustomerOrderDTO searchCustomer(CustomerOrderDTO customer) throws Exception {
        CustomerOrderDTO searchedCustomer = customerDAO.search(customer);
        return searchedCustomer;
    }
    public static boolean updateCustomer(CustomerOrderDTO customer)throws Exception{
        boolean result = customerDAO.update(customer);
        return result;
    }

    public static ArrayList<CustomerOrderDTO> getAllCustomers() throws Exception {
        return customerDAO.getAll();
    }









}
