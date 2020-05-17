/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sellingsystem.controller;

import java.util.ArrayList;
import lk.ijse.sellingsystem.core.dto.BatchDTO;
import lk.ijse.sellingsystem.dao.DAOFactory;
import lk.ijse.sellingsystem.dao.custom.BatchDAO;

/**
 *
 * @author Samishka
 */
public class BatchController {
    public static BatchDAO batchDAO=(BatchDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.BATCH);
    public static boolean addBatch(BatchDTO batchDTO) throws Exception{
        boolean result=batchDAO.add(batchDTO);
        return result;
    }
    public static boolean deleteBatch(BatchDTO batchDTO) throws Exception{
        boolean result=batchDAO.add(batchDTO);
        return result;
    }
    public static BatchDTO searchBatch(BatchDTO batchDTO) throws Exception{
        BatchDTO searchBatch=batchDAO.search(batchDTO);
        return searchBatch(batchDTO);
    }
    public static Boolean updateBatch(BatchDTO batchDTO) throws Exception{
        boolean result=batchDAO.update(batchDTO);
        return result;

    }
    public static ArrayList<BatchDTO>getAllBatch() throws Exception{
        return batchDAO.getAll();
    }

}
