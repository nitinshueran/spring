package com.shu.nitin.di.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shu.nitin.commons.model.Customer;
import com.shu.nitin.commons.repository.CustomerRepository;
import com.shu.nitin.commons.service.CustomerService;

@Service("setterInjectionCustomerServiceImpl")
public class SetterInjectionCustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepositoryImpl;

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepositoryImpl.findAllCustomers();
    }

    public void setCustomerRepositoryImpl(CustomerRepository customerRepositoryImpl) {
        this.customerRepositoryImpl = customerRepositoryImpl;
    }

}
