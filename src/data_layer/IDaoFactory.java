package data_layer;

// abstract factory interface. Creates data access objects.

import data_layer.employee_dao.IEmployeeDao;
import data_layer.customer_dao.ICustomerDao;

// ** GoF Design Pattern: Factory.    
public interface IDaoFactory {
    ICustomerDao customerDao() throws Exception;
    IEmployeeDao employeeDao() throws Exception;  
    //.....
}
