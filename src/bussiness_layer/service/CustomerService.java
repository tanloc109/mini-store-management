package bussiness_layer.service;

import bussiness_layer.entity.Customer;
import data_layer.customer_dao.ICustomerDao;
import data_layer.DaoFactory;
import data_layer.IDaoFactory;
import java.util.List;

/**
 *
 * @author SwordLake
 */
public class CustomerService implements IService<Customer> {

    ICustomerDao customerAction;
    IDaoFactory cutomerDaoFactory;

    public CustomerService() {
    }
    //--------------------------------------------------

    public CustomerService(String inputDataFile) throws Exception {
        cutomerDaoFactory = new DaoFactory(inputDataFile);
        this.customerAction = cutomerDaoFactory.customerDao();
    }
    //--------------------------------------------------
    @Override
    public void printList() throws Exception {
        customerAction.getList().forEach(obj -> System.out.println(obj));
//        for(var obj : customerAction.getList()){
//            System.out.println(obj);
//        }
    }
    //--------------------------------------------------
    public List<Customer> getList() throws Exception {
        return customerAction.getList();
    }
    //--------------------------------------------------
    public void add(Customer obj) throws Exception {
        customerAction.addNew(obj);
    }

    //To do here    
}
