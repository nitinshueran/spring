package com.shu.nit.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.shu.nit.commons.model.Customer;
import com.shu.nit.commons.service.CustomerService;
import com.shu.nit.coupled.service.impl.CoupledCustomerServiceImpl;
import com.shu.nit.di.service.impl.SetterInjectionCustomerServiceImpl;

@Component
public class Application {

    public static void main(String[] args) {

        System.out.print("Tightly coupled service invocation output: -> | ");
        CustomerService tightlyCoupledCustomerService = new CoupledCustomerServiceImpl();
        print(tightlyCoupledCustomerService.findAllCustomers());

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.print("Dependency injected service invocation output: -> | ");
        CustomerService customerServiceSetterInjection = appContext.getBean("customerServiceSetterInjection",
                CustomerService.class);
        print(customerServiceSetterInjection.findAllCustomers());

        System.out.print("Dependency injected via constructor output: -> | ");
        CustomerService customerServiceConstructorInjection = appContext.getBean("customerServiceConstructorInjection",
                CustomerService.class);
        print(customerServiceConstructorInjection.findAllCustomers());

        System.out.print("Dependency injected via autowiring by name output: -> | ");
        CustomerService autowireByNameCustomerService = appContext.getBean("autowireByNameCustomerService",
                CustomerService.class);
        print(autowireByNameCustomerService.findAllCustomers());

        System.out.print("Dependency injected via autowiring by type output: -> | ");
        CustomerService autowireByTypeCustomerService = appContext.getBean("autowireByTypeCustomerService",
                CustomerService.class);
        print(autowireByTypeCustomerService.findAllCustomers());

        System.out.print("Dependency injected via autowiring by constructor output: -> | ");
        CustomerService autowireByConstructorCustomerService = appContext
                .getBean("autowireByConstructorCustomerService", CustomerService.class);
        print(autowireByConstructorCustomerService.findAllCustomers());

        System.out.print("Dependency injected via annotation output: -> | ");
        CustomerService annotationCustomerService = appContext.getBean("annotationCustomerServiceimpl",
                CustomerService.class);
        print(annotationCustomerService.findAllCustomers());

        System.out.print("Java config dependency injection service invocation output: -> | ");
        CustomerService setterInjectionJavaConfigCustomerService = appContext
                .getBean("setterInjectionJavaConfigCustomerService", SetterInjectionCustomerServiceImpl.class);
        print(setterInjectionJavaConfigCustomerService.findAllCustomers());
    }

    private static void print(List<Customer> customers) {
        customers.forEach(customer -> System.out.print(customer.getfName() + "| "));
        System.out.println();
    }

}
