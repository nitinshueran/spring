package com.shu.nit.commons.model;

import org.springframework.stereotype.Component;

@Component
public class Customer {

    private String fName;
    private String lName;
    private String cId;

    public Customer() {
        super();
    }

    public Customer(String fName, String lName, String cId) {
        super();
        this.fName = fName;
        this.lName = lName;
        this.cId = cId;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getcId() {
        return cId;
    }

}
