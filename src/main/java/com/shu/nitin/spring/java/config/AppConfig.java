package com.shu.nitin.spring.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.shu.nitin.commons.repository.CustomerRepository;
import com.shu.nitin.commons.repository.CustomerRepositoryImpl;
import com.shu.nitin.commons.service.CustomerService;
import com.shu.nitin.di.service.impl.AutowiredAnnotationCustomerServiceimpl;
import com.shu.nitin.di.service.impl.ConstructorinjectionCustomerServiceImpl;
import com.shu.nitin.di.service.impl.SetterInjectionCustomerServiceImpl;

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

    @Bean(name = "autowiredInjectionJavaConfigCustomerService")
    public CustomerService getAutowiredInjectionJavaConfigCustomerService() {
        return new AutowiredAnnotationCustomerServiceimpl();
    }

}
