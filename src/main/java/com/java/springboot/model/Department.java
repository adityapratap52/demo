package com.java.springboot.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Department {
    public final int id;
    public final String deptName;
    public final String phoneNumber;
    public final String emailAddress;

    public Department(@JsonProperty("id") int id,
                      @JsonProperty("deptName") String deptName,
                      @JsonProperty("phoneNumber") String phoneNumber,
                      @JsonProperty("emailAddress") String emailAddress) {
        this.id = id;
        this.deptName = deptName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public int getId() {
        return id;
    }

    public String getDeptName() {
        return deptName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
