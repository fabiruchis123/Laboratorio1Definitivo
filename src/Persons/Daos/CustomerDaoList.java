package Persons.Daos;

import Dao.Dao;
import Persons.Dtos.CustomerDto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class CustomerDaoList implements Dao<CustomerDto> {

    private HashMap<String, CustomerDto> customerList;
    
    @Override
    public boolean create(CustomerDto cust) {
        if (cust == null) return false;
        customerList.put(cust.getId(), cust);
        return true;   
    }

    @Override
    public CustomerDto read(String id) {
        return customerList.get(id);
    }

    @Override
    public List<CustomerDto> readAll() {
        return new ArrayList<CustomerDto>(customerList.values());
    }

    @Override
    public boolean update(CustomerDto cust) {
        return this.create(cust);
    }

    @Override
    public boolean delete(CustomerDto cust) {
        return customerList.remove(cust.getId()) != null;
        }
    
}
