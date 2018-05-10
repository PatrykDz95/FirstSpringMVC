package com.luv2code.springdemo;


import com.luv2code.springdemo.com.luv2code.springdemo.validation.CourseCode;

import javax.validation.constraints.*;

public class Customer {

private String firstName;

@NotNull(message="is required")
@Size(min=1, message="is required")
private String lastName;

@NotNull(message="is required")
@Min(value = 0, message = "Must be greater than zero or equal")
@Max(value = 10, message = "Must be less than 10 or equal")
private Integer freePasses;

@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 digits")
private String postalCode;

@CourseCode(value = "COS", message = "must start with COS")
private String courseCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
