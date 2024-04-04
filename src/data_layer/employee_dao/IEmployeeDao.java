package data_layer.employee_dao;

import bussiness_layer.entity.Employee;
import data_layer.IUserDao;

/**
 *
 * @author SwordLake
 */
public interface IEmployeeDao extends IUserDao<Employee>{   
    void loadDataFromFile() throws Exception ;   
    //--------------------------------------------------  
    //To do here..........
}
