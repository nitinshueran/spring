package com.shu.nit.commons.repository;

import java.util.List;

import com.shu.nit.commons.model.Customer;

public interface CustomerRepository {

    List<Customer> findAllCustomers();

}