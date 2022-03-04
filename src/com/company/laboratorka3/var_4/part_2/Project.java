package com.company.laboratorka3.var_4.part_2;

public class Project {
    Brigade brigade;
    String nameCustomer;
    House house;
    Project(Brigade brigade, String nameCustomer, int nFloors, String color) {
        this.house = new House(nFloors, color);
        this.brigade = brigade;
        this.nameCustomer = nameCustomer;
    }
    public String toString() {
        return "Бригада: " + brigade.toString() + "имя заказчика: " + nameCustomer + house.toString();
    }
}
