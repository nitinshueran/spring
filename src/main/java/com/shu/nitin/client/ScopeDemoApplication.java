package com.shu.nitin.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shu.nitin.commons.model.ScopeDemoBean;

public class ScopeDemoApplication {

    public static void main(String[] args) {

        // We can change the Scope in ScopeDemoBean using @Scope annotation and based on that Spring will provide the
        // ScopeDemoBean instance to us
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ScopeDemoBean sdb1 = applicationContext.getBean("scopeDemoBean", ScopeDemoBean.class);
        sdb1.setScope("singleton");

        ScopeDemoBean sdb2 = applicationContext.getBean("scopeDemoBean", ScopeDemoBean.class);
        System.out.println(sdb2.getScope());
    }

}
