package com.shu.nit.coupled.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shu.nit.commons.model.Customer;
import com.shu.nit.commons.repository.CustomerRepository;
import com.shu.nit.commons.repository.CustomerRepositoryImpl;
import com.shu.nit.commons.service.CustomerService;

@Service("coupledCustomerServiceImpl")
public class CoupledCustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAllCustomers();
    }

}
