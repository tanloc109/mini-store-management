package application.ui;

import application.utilities.DataInput;
import bussiness_layer.service.CustomerService;
import bussiness_layer.service.EmployeeService;
import bussiness_layer.service.IService;
import java.util.Collections;

public class Program {

    public static void main(String[] args) {
        int choice;
        String employeeInputFile = "Employees.txt";
        String customerInputFile = "Customers.txt";

        System.out.println(String.join("", Collections.nCopies(10, "**********")));

        try {
            IService employeeService = new EmployeeService(employeeInputFile);
            IService customerService = new CustomerService(customerInputFile);
            do {
                Menu.print("1.Employee Management|2.Customer Management|3.Exit|Select:");
                choice = DataInput.getIntegerNumber();
                switch (choice) {
                    case 1:
                        Menu.manageEmployee(employeeService);
                        break;
                    case 2:
                        Menu.manageCustomer(customerService);
                        break;
                    default:
                        System.out.println("Good bye !");
                        System.exit(0);
                        break;
                }
            } while (true);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
