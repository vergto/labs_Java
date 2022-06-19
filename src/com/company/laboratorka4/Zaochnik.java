package com.company.laboratorka4;

import com.company.laboratorka4.Student;

public class Zaochnik extends Student {
    private String type;

    public Zaochnik(String name, String type){
        super(name);
        this.type = type;
    }

    @Override
    public String getName() {
        return super.getName() + " " + this.type;
    }

    @Override
    public String toString() {
        return "Zaochnik{" + super.toString() +
                "type='" + type + '\'' +
                '}';
    }
}
