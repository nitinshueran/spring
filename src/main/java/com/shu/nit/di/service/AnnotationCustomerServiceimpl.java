package com.shu.nit.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shu.nit.commons.model.Customer;
import com.shu.nit.commons.repository.CustomerRepository;
import com.shu.nit.commons.service.CustomerService;

@Component("annotationCustomerServiceimpl")
public class AnnotationCustomerServiceimpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAllCustomers();
    }

}
