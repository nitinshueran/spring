package com.shu.nit.di.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shu.nit.commons.model.Customer;
import com.shu.nit.commons.repository.CustomerRepository;
import com.shu.nit.commons.service.CustomerService;

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
