package com.shu.nit.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.shu.nit.commons.model.Customer;
import com.shu.nit.commons.service.CustomerService;
import com.shu.nit.coupled.service.impl.CoupledCustomerServiceImpl;

@Component
public class Application {

    public static void main(String[] args) {

        System.out.print("Tightly coupled service invocation output: -> | ");
        CustomerService customerService = new CoupledCustomerServiceImpl();
        print(customerService.findAllCustomers());

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.print("Dependency injected service invocation output: -> | ");
        // CustomerService customerService = appContext.getBean(CustomerService.class);
        // CustomerService customerService = appContext.getBean("customerServiceConstructor", CustomerService.class);
        // CustomerService customerService = appContext.getBean("autowireByNameCustomerService", CustomerService.class);
        // CustomerService customerService = appContext.getBean("autowireByTypeCustomerService", CustomerService.class);

        /*
         * CustomerService diCustomerService = applicationContext.getBean("autowireByConstructorCustomerService",
         * CustomerService.class);
         * 
         * print(diCustomerService.findAllCustomers());
         */

        CustomerService annotationCustomerService = applicationContext.getBean("annotationCustomerServiceimpl",
                CustomerService.class);

        print(annotationCustomerService.findAllCustomers());
    }

    private static void print(List<Customer> customers) {
        customers.forEach(customer -> System.out.print(customer.getfName() + "| "));
        System.out.println();
    }

}
