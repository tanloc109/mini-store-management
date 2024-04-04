package data_layer.customer_dao;

/**
 *
 * @author Sword Lake
 */


import data_layer.IUserDao;
// defines methods to access orders.
// this is a database-independent interface. 
// Implementations are database specific
// ** DAO Pattern
public interface ICustomerDao<Customer> extends IUserDao<Customer>{    
    void loadDataFromFile() throws Exception ;   
}