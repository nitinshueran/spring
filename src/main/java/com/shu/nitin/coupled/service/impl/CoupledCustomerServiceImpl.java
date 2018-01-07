package com.shu.nitin.coupled.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shu.nitin.commons.model.Customer;
import com.shu.nitin.commons.repository.CustomerRepository;
import com.shu.nitin.commons.repository.CustomerRepositoryImpl;
import com.shu.nitin.commons.service.CustomerService;

@Service("coupledCustomerServiceImpl")
public class CoupledCustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAllCustomers();
    }

}
