package data_layer.customer_dao;

import bussiness_layer.entity.Customer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import data_layer.IFileManager;

public class CustomerDao implements ICustomerDao<Customer> {

    //Declare an arraylist to store users Customers  
    IFileManager<Customer> fileManager;
    List<Customer> customerList = new ArrayList<>();

    public CustomerDao() {
    }

    public CustomerDao(IFileManager fileManager) throws Exception {
        this.fileManager = fileManager;
        loadDataFromFile();
    }

    @Override
    public void loadDataFromFile() throws Exception {
        String id, name, address;
        List<String> cusData = fileManager.readDataFromFile();
        for (String c : cusData) {
            List<String> emp = Arrays.asList(c.split(","));
            id = emp.get(0).trim();
            name = emp.get(1).trim();
            address = emp.get(2).trim();
            Customer newCustomer = new Customer(id, name, address);
            addNew(newCustomer);
        }
    }

    @Override
    public List<Customer> getList() throws Exception {
        if (customerList.isEmpty()) {
            throw new Exception("Customer list is empty.");
        }
        return customerList;
    }

    @Override
    public void addNew(Customer customer) throws Exception {
        customerList.add(customer);
    }

}
