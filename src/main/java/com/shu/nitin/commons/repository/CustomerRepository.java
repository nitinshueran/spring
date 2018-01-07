package com.shu.nitin.commons.repository;

import java.util.List;

import com.shu.nitin.commons.model.Customer;

public interface CustomerRepository {

    List<Customer> findAllCustomers();

}