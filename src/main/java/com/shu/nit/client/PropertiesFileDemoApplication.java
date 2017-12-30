package com.shu.nit.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shu.nit.commons.model.PropertiesFileBean;

public class PropertiesFileDemoApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        PropertiesFileBean propertiesFileBean = applicationContext.getBean("propertiesFileBean",
                PropertiesFileBean.class);
        System.out.println(
                "UserName:" + propertiesFileBean.getUserName() + " Password:" + propertiesFileBean.getPassword());
    }

}
