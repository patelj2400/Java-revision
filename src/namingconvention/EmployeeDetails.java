//Use lowercase letters.
//Avoid underscores or special characters.
//Use reverse domain name notation for uniqueness (e.g., com.example.project).
//package com.company.project;
//package org.apache.commons;

package namingconvention;

//Class name
//Use PascalCase (also known as UpperCamelCase).
//Start with an uppercase letter.
//Use nouns or noun phrases to represent objects or entities.
//Avoid abbreviations unless widely known.

class Employee {}
class BankAccount {}
class StringUtils {}




public class EmployeeDetails {



//    Use camelCase.
//    Start with a lowercase letter.
//    Be descriptive and meaningful.
//    Avoid single-letter names (except for loop counters or temporary variables).

    int employeeId;
    String firstName;
    double accountBalance;
    String employeeName;


//    Use UPPER_SNAKE_CASE.
//    Use all uppercase letters.
//    Separate words with underscores (_).
//    Constants are typically static final fields.

    static final int MAX_COUNT = 100;
    static final String DEFAULT_COUNTRY = "USA";
    static final int MAX_EMPLOYEE_NAME_LENGTH = 20;

    public static void main(String[] args) {

    }



    //Methods
//    Use camelCase.
//    Start with a lowercase letter.
//    Use verbs or verb phrases to describe actions.
//    Be descriptive and concise.


    void calculateSalary() {

    }

    String getEmployeeName() {
        return employeeName;
    }

    boolean isValid() {
        return true;
    }


}
