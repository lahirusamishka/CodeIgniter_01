/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sellingsystem.dao;

import lk.ijse.sellingsystem.dao.custom.impl.CustomerDAOImpl;
import lk.ijse.sellingsystem.dao.custom.impl.CustomerOrderDAOImpl;
import lk.ijse.sellingsystem.dao.custom.impl.GRNDAOImpl;
import lk.ijse.sellingsystem.dao.custom.impl.InstallmentDAOImpl;
import lk.ijse.sellingsystem.dao.custom.impl.PaymentDAOImpl;
import lk.ijse.sellingsystem.dao.custom.impl.PaymentTypeDAOImpl;
import lk.ijse.sellingsystem.dao.custom.impl.S_O_DDAOImpl;
import lk.ijse.sellingsystem.dao.custom.impl.SupplierDAOImpl;
import lk.ijse.sellingsystem.dao.custom.impl.SupplierOrderDAOImpl;
import lk.ijse.sellingsystem.dao.custom.impl.SupplierPaymentDAOImpl;
import lk.ijse.sellingsystem.dao.custom.impl.VehicleDAOImpl;

/**
 *
 * @author Samishka
 */
public class DAOFactory {

    public enum DAOTypes {
        BATCH, CUSTOMER, CUSTOMERORDER, GRN, INSTALLMENT, PAYMENT, PAYMENTTYPE, SOD, SUPPLIER, SUPPLIERORDER, SUPPLIERPAYMENT, VEHICLE
    }

    private static DAOFactory daoFactory;

    private DAOFactory() {

    }

    public static DAOFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public SuperDAO getDAO(DAOTypes daoType) {
        switch (daoType) {
            case BATCH:
            case CUSTOMER:
                return new CustomerDAOImpl();
            case CUSTOMERORDER:
                return new CustomerOrderDAOImpl();
            case GRN:
                return new GRNDAOImpl();
            case INSTALLMENT:
                return new InstallmentDAOImpl();
            case PAYMENT:
                return new PaymentDAOImpl();
            case PAYMENTTYPE:
                return new PaymentTypeDAOImpl();
            case SOD:
                return new S_O_DDAOImpl();
            case SUPPLIER:
                return new SupplierDAOImpl();
            case SUPPLIERORDER:
                return new SupplierOrderDAOImpl();
            case SUPPLIERPAYMENT:
                return new SupplierPaymentDAOImpl();
            case VEHICLE:
                return new VehicleDAOImpl();

            default:
                return null;
        }
    }
}
