package com.company.laboratorka4;

import java.util.Objects;

public class Element {
    private String name;
    private String type;

    public Element(String name){
        this.name = name;
    }

    public void setType(String type) {
        if ((Objects.equals(type, "Catalog"))||(Objects.equals(type, "Track"))){
            this.type = type;
        } else{
            System.out.println("Ошибка, неверный тип элемента");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTrack(){
        return Objects.equals(type, "Track");
    }

    public boolean isCatalog(){
        return Objects.equals(type, "Catalog");
    }

    @Override
    public String toString() {
        return "Element{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
