package com.shu.nitin.commons.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.shu.nitin.commons.model.Customer;

@Component("customerRepositoryImpl")
public class CustomerRepositoryImpl implements CustomerRepository {

    /*
     * (non-Javadoc)
     * 
     * @see com.shu.nit.repository.impl.CustomerRepository#findAllCustomers()
     */
    @Override
    public List<Customer> findAllCustomers() {
        List<Customer> customers = Arrays.asList(new Customer("Akshita", "Sheoran", "1"),
                new Customer("Nitin", "Sheoran", "2"), new Customer("Nitesh", "Sheoran", "3"));
        return customers;
    }

}
