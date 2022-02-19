package com.company.laboratorka3;

import com.company.Library;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("|_|_|_|_|_|_|_|_|");
        int n = 4;
        int x,y;
        //  Лабораторная работа 3 - Вариант 1 - Задание 1
        MyVector vector = new MyVector(n);
        //vector.sum(x, y);
        Library.print_array(vector.getVector_date_mas());
        //Вывод Сложения
        System.out.println(Arrays.toString(vector.get_sum(0, 1)));
        //Вывод вычитания
        System.out.println(Arrays.toString(vector.get_subtract(2, 3)));
        //Вывод инкремента вектора
        System.out.println(Arrays.toString(vector.get_inc(0)));
        //Вывод инкремента вектора
        System.out.println(Arrays.toString(vector.get_dec(0)));
        //Вывод индекса указанного вектора
        System.out.println(vector.get_index(1, 3));
        //Вывод скалярного произведения
        System.out.println(vector.get_scalar(0, 1));
        //Вывод длины вектора
        System.out.println(vector.get_length(1));
        //Угол векторов
        System.out.println(vector.get_corner(0, 1));
        //  Лабораторная работа 3 - Вариант 1 - Задание 2
        // Колиниарность векторов
        System.out.println(vector.get_collin(0, 1)? "Коллинеарны" : "Не коллинеарны");
        // Ортоганальность векторов
        System.out.println(vector.get_ortogonal(1, 2)? "Ортогональны" : "Не ортогональны");

        //  Лабораторная работа 3 - Вариант 2 - Задание 1
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student(i);
        }
        System.out.println(Arrays.toString(students));
        //
    }
}
