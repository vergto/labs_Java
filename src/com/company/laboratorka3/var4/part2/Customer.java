package com.company.laboratorka3.var4.part2;

public class Customer {
    String name;
    Account[] account = new Account[5];
    Specification[] specifications;
    int count;
    Customer(String name, int maxSpecifications) {
        this.name = name;
        specifications = new Specification[maxSpecifications];
        count = 0;

    }
    public void createSpecification(int nFloors, String color) {
        specifications[count] = new Specification(nFloors, color, this.name);
        count++;
    }
}
