package com.company.laboratorka6;

import java.util.*;

public class Parking {
    static HashMap<Integer, String> parkingHashMap;

    public Parking(){
        parkingHashMap = new HashMap<>();
        for (int i = 0; i < 10; i++){
            // помещаем в коллекцию ключ и значение
            parkingHashMap.put(i + 1, "Vacant");
        }
    }

    public static class Car{
        String name;
        int place_number;

        public Car(String name){
            this.name = name;
            this.place_number = -1;
        }

        public String get_status() {
            if (this.place_number == -1){
                return "not parked";
            } else {
                return "parked";
            }
        }

        public void parking(){
            boolean flag = false;
            List<Integer> indexes = new ArrayList<Integer>(parkingHashMap.keySet());
            for (int index : indexes){
                if (Objects.equals(parkingHashMap.get(index), "Vacant")){
                    parkingHashMap.replace(index, "Engaged");
                    this.place_number = index;
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("Машина припаркована на место " + this.place_number);
            } else {
                System.out.println("Все места заняты");
            }
        }

        public void leaving(){
            if (Objects.equals(this.get_status(), "parked")){
                parkingHashMap.replace(this.place_number, "Vacant");
                System.out.println("Машина уехала с места " + this.place_number);
                this.place_number = -1;
            } else {
                System.out.println("Машина не припаркована");
            }
        }
    }

    @Override
    public String toString() {
        return "Parking{" +
                "parkingHashMap=" + parkingHashMap +
                '}';
    }
}
