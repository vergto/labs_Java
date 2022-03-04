package com.company.laboratorka3.var_4.part_2;

public class House {
    int nFloors;
    String color;
    House(int nFloors, String color) {
        this.nFloors = nFloors;
        this.color = color;
    }
    public String toString() {
        return " Количество этажей в доме: " + nFloors + " Цвет дома: " + color;
    }
}
