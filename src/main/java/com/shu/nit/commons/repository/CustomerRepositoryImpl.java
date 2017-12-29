package com.shu.nit.commons.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.shu.nit.commons.model.Customer;

@Component("customerRepositoryImpl")
public class CustomerRepositoryImpl implements CustomerRepository {

    /*
     * (non-Javadoc)
     * 
     * @see com.shu.nit.repository.impl.CustomerRepository#findAllCustomers()
     */
    @Override
    public List<Customer> findAllCustomers() {
        List<Customer> customers = Arrays.asList(new Customer("Akshita", "Sheoran"), new Customer("Nitin", "Sheoran"),
                new Customer("Nitesh", "Sheoran"));
        return customers;
    }

}
