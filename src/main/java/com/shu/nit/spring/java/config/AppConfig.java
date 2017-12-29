package com.shu.nit.spring.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.shu.nit.commons.repository.CustomerRepository;
import com.shu.nit.commons.repository.CustomerRepositoryImpl;
import com.shu.nit.commons.service.CustomerService;
import com.shu.nit.di.service.impl.ConstructorinjectionCustomerServiceImpl;
import com.shu.nit.di.service.impl.SetterInjectionCustomerServiceImpl;

@Configuration
public class AppConfig {

    @Bean(name = "customerRepositoryImpl")
    public CustomerRepository getCustomerRepository() {
        return new CustomerRepositoryImpl();
    }

    @Bean(name = "setterInjectionJavaConfigCustomerService")
    public CustomerService getSetterInjectionCustomerService() {
        SetterInjectionCustomerServiceImpl setterInjectionCustomerService = new SetterInjectionCustomerServiceImpl();
        setterInjectionCustomerService.setCustomerRepositoryImpl(getCustomerRepository());
        return setterInjectionCustomerService;
    }

    @Bean(name = "constructiorInjectionJavaConfigCustomerService")
    public CustomerService getConstructiorInjectionCustomerService() {
        CustomerService constructiorInjectionCustomerService = new ConstructorinjectionCustomerServiceImpl(
                getCustomerRepository());
        return constructiorInjectionCustomerService;
    }

}
