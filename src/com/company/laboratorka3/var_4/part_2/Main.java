package com.company.laboratorka3.var_4.part_2;

public class Main {
    public static void main(String[] args) {
        DesignBureau designBureau = new DesignBureau();
        Customer customer = new Customer("Sidirov", 5);
        customer.createSpecification(5, "Yellow");
        designBureau.mainDesigner.registration(customer.specifications[0], customer);
        System.out.println(designBureau.mainDesigner.projects[0].toString());
    }
}
