package com.company.laboratorka4;

import com.company.laboratorka4.Element;

import java.util.ArrayList;
import java.util.HashMap;

public class CD {
    private String name;

    public CD(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static class Component{
        private HashMap<Element, ArrayList<Element>> catalogHashMap;
        private ArrayList<Element> rootCatalogs;

        public Component() {
            catalogHashMap = new HashMap<>();
            rootCatalogs = new ArrayList<>();
        }

        public void addCatalog(Element catalog){
            if (catalog.isCatalog()){
                rootCatalogs.add(catalog);
            } else {
                System.out.println("Type error");
            }
        }

        public void addCatalog(Element catalog, Element directory){
            if (catalog.isCatalog() && directory.isCatalog()){
                if (catalogHashMap.get(directory)==null){
                    ArrayList<Element> buf = new ArrayList<>();
                    buf.add(catalog);
                    catalogHashMap.put(directory, buf);
                } else{
                    catalogHashMap.get(directory).add(catalog);
                }
            } else{
                System.out.println("Type error");
            }
        }

        public void addTrack(Element track, Element catalog){
            if (catalog.isCatalog() && track.isTrack()){
                if (catalogHashMap.get(catalog)==null){
                    ArrayList<Element> buf = new ArrayList<>();
                    buf.add(track);
                    catalogHashMap.put(catalog, buf);
                } else{
                    catalogHashMap.get(catalog).add(track);
                }
            }else {
                System.out.println("Type error");
            }
        }

        @Override
        public String toString() {
            return "Component{" +
                    ", catalogHashMap=" + catalogHashMap +
                    ", rootCatalogs=" + rootCatalogs +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "CD{" +
                "name='" + name + '\'' +
                '}';
    }
}
