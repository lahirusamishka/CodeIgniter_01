/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sellingsystem.dao.custom;

import java.util.ArrayList;
import lk.ijse.sellingsystem.core.dto.CustomerDTO;
import lk.ijse.sellingsystem.dao.SuperDAO;

/**
 *
 * @author Samishka
 */
public interface CustomerDAO extends SuperDAO<CustomerDTO>{
    
    public ArrayList<String> getAllCourseID()throws Exception;
    
}
