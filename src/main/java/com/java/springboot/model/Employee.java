package com.java.springboot.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
    public final int userId;
    public final String jobTitleName;
    public final String firstName;
    public final String lastName;
    public final String phoneNumber;
    public final String emailAddress;

    public Employee(@JsonProperty("userId") int userId,
                    @JsonProperty("jobTitleName") String jobTitleName,
                    @JsonProperty("firstName") String firstName,
                    @JsonProperty("lastName") String lastName,
                    @JsonProperty("phoneNumber") String phoneNumber,
                    @JsonProperty("emailAddress") String emailAddress) {
        this.userId = userId;
        this.jobTitleName = jobTitleName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public int getUserId() {
        return userId;
    }

    public String getJobTitleName() {
        return jobTitleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
