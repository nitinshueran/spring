package com.shu.nitin.commons.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ScopeDemoBean {

    private String scope;

    public ScopeDemoBean() {
        // TODO Auto-generated constructor stub
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

}
