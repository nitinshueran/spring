package com.shu.nitin.di.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shu.nitin.commons.model.Customer;
import com.shu.nitin.commons.repository.CustomerRepository;
import com.shu.nitin.commons.service.CustomerService;

@Component("autowiredAnnotationCustomerServiceimpl")
public class AutowiredAnnotationCustomerServiceimpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAllCustomers();
    }

}
