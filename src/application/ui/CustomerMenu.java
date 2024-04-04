package application.ui;

import application.utilities.DataInput;
import bussiness_layer.entity.Customer;
import bussiness_layer.service.IService;

/**
 *
 * @author SwordLake
 */
public class CustomerMenu {

    IService<Customer> service;

    //--------------------------------------------------  
    public CustomerMenu(IService<Customer> service) {
        this.service = service;
    }

    //--------------------------------------------------  
    public void processMenuForCustomer() {
        boolean stop = true;
        try {
            do {
                Menu.print("******Customer Management******|1.Add Customer|2.Update Customer|3.Remove Customer"
                        + "|4.Find Customer|5.Print Customer List|6.Export to file|7.Back to main menu|Select :");
                int choice = Menu.getUserChoice();
                switch (choice) {
                    case 1:
                        addNewCustomer();
                        break;
                    case 2:
                        System.out.println(">>Customer updated successfully.");
                        break;
                    case 3:
                        System.out.println(">>Customer removed successfully.");
                        break;
                    case 4:
                        System.out.println(">>Customer found.");
                        break;
                    case 5:
                        System.out.println(">>Customer List:");
                        service.printList();
                        break;
                    case 6:
                        System.out.println(">>Customer list exported successfully.");
                        break;
                    case 7:
                        stop = false;
                        break;
                    default:
                        System.out.println(">>Choice invalid");
                }
            } while (stop);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //--------------------------------------------------    
    public Customer getCustomer() throws Exception {
        String id = DataInput.getString("Enter customer id:");
        String name = DataInput.getString("Enter customer name:");
        String address = DataInput.getString("Enter customer address:");
        return new Customer(id, name, address);
    }

    //--------------------------------------------------  
    public void addNewCustomer() {
        try {
            Customer newCustomer = getCustomer();
            service.add(newCustomer);
            System.out.println(">>Customer added successfully.");
        } catch (Exception e) {
            System.out.println(">>" + e.getMessage());
        }
    }
    //--------------------------------------------------  
    //To do here..........
}
