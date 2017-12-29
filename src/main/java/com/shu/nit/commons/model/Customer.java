package com.shu.nit.commons.model;

import org.springframework.stereotype.Component;

@Component
public class Customer {

    private String fName;
    private String lName;

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public Customer() {
        super();
    }

    public Customer(String fName, String lName) {
        super();
        this.fName = fName;
        this.lName = lName;
    }

}
