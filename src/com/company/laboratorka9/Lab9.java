package com.company.laboratorka9;


import java.util.*;
import java.util.stream.Collectors;

public class Lab9 {
//    public static void main(String[] args){
//        Collection<String> collection = Arrays.asList("Строка 1", "Строка 2", "Строка 3");
//        System.out.println("Первый элемент: " + collection.stream().findFirst().get());
//        boolean flag = collection.stream().allMatch(str-> str.matches("Строка [1-3]"));
//        if (flag) {
//            System.out.println("Все строки совпадают с шаблоном");
//        } else {
//            System.out.println("Есть строки не совпадающие с шаблоном");
//        }
//    }



//    public static void main(String[] args){
//        Collection<Integer> collection = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        int sum = collection.stream().filter(num-> num % 2 != 0).reduce(Integer::sum).orElse(0);
//        System.out.println("Сумма нечетных чисел: " + sum);
//    }


//    public static void main(String[] args){
//        Collection<People> peoples = Arrays.asList(
//                new People("Ivan", 16),
//                new People("Petr", 23),
//                new People("Maria", 42)
//        );
//        System.out.println(peoples.stream().sorted((first, second)->-first.getName().compareTo(second.getName())).toList());
//    }


      public static void main(String[] args){
        Collection<People> peoples = Arrays.asList(
                new People("Ivan", 16),
                new People("Petr", 23),
                new People("Maria", 42)
        );
        System.out.println(peoples.stream().sorted(Comparator.comparingInt(People::getAge)).collect(Collectors.toList()));
    }

}



