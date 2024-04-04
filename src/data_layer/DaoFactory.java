package data_layer;
 // Data access object factory
 // ** Factory Patte
import data_layer.employee_dao.IEmployeeDao;
import data_layer.employee_dao.EmployeeDao;
import data_layer.customer_dao.ICustomerDao;
import data_layer.customer_dao.CustomerDao;

public class DaoFactory implements IDaoFactory{
   
    IFileManager fileManager;

    public DaoFactory() {
    }    
    
    public DaoFactory(String inputDataFile) {       
        this.fileManager = new FileManager(inputDataFile);
    }
    
    @Override
    public ICustomerDao customerDao() throws Exception{
        return new CustomerDao(fileManager);
    }

    @Override
    public IEmployeeDao employeeDao() throws Exception{
        return new EmployeeDao(fileManager);
    }

  
}
