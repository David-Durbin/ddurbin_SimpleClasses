package com.company;

public class Main {

    public static void main(String[] args) {
	    // Create Employees Objects
        Employees employees1 = new Employees("Don", "Rickles", "555-9021");
        Employees employees2 = new Employees("Bob", "Hope", "468-4673");
        Employees employees3 = new Employees("Paul", "Simon", "013-1491");

        // call display function
        System.out.println("------ Employee Information ------");
        employees1.DisplayInfo();
        employees2.DisplayInfo();
        employees3.DisplayInfo();
    }
}
