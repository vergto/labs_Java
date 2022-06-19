package com.company.laboratorka3.var4.part2;

public class MainDesigner {
    String name;
    Specification[] specifications;
    int count;
    int countBrigades;
    Project[] projects;
    Brigade[] brigades;
    MainDesigner(String name, int maxSpecifications, int maxProjects, int maxBrigades) {
        this.name = name;
        specifications = new Specification[maxSpecifications];
        projects = new Project[maxProjects];
        brigades = new Brigade[maxBrigades];
        count = 0;
        countBrigades = 0;
    }
    public void registration(Specification specification, Customer customer) {
        this.specifications[count] = specification;
        Account account = new Account((int)(Math.random()*100), (int)(Math.random()*100));
        customer.account[count] = account;
        createDesigners(5);
        projects[count] = new Project(brigades[count], customer.name, specifications[count].nFloors, specifications[count].color);
        count++;

    }
    public void createDesigners(int maxDesigners) {
        brigades[count] = new Brigade(maxDesigners);
    }
}
