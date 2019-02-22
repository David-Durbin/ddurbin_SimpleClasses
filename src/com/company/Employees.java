package com.company;

public class Employees {
    // variables
    String sFirstName = "";
    String sLastName = "";
    String sPhone = "";

    // Constructor
    public Employees(String sFirstName, String sLastName, String sPhone) {
        this.sFirstName = sFirstName;
        this.sLastName = sLastName;
        this.sPhone = sPhone;
    }

    public void DisplayInfo()
    {
        System.out.println("First Name:    " + sFirstName);
        System.out.println("Last Name:     " + sLastName);
        System.out.println("Contact Phone: " + sPhone);
        System.out.println();
    }
}
