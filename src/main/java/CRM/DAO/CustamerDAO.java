package CRM.DAO;

import CRM.Entity.Customer;

import java.util.List;

public interface CustamerDAO {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);

}