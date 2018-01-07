package com.shu.nitin.di.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shu.nitin.commons.model.Customer;
import com.shu.nitin.commons.repository.CustomerRepository;
import com.shu.nitin.commons.service.CustomerService;

@Service("constructorinjectionCustomerServiceImpl")
public class ConstructorinjectionCustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public ConstructorinjectionCustomerServiceImpl(CustomerRepository customerRepository) {
        super();
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAllCustomers();
    }

}
