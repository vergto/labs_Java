package com.company.laboratorka3.var4.part2;

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
