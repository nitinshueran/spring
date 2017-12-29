package com.shu.nit.di.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shu.nit.commons.model.Customer;
import com.shu.nit.commons.repository.CustomerRepository;
import com.shu.nit.commons.service.CustomerService;

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
