package com.company.laboratorka3;

import com.company.Library;

import javax.crypto.Cipher;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("|_|_|_|_|_|_|_|_|");
        int n = 6;
        int counter = 0;
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
        //список студентов заданного факультета;
        System.out.println("Список студентов заданного факультета: ");
        for (int i = 0; i < n; i++) {
            if (students[i].getFaculty().equals("Faculty of Computer Science")) {
                System.out.println(students[i]);
                counter = 1;
            }
        }
        if (counter == 0)
            System.out.println("По заданному факультету студентов НЕТ");
        //списки студентов для каждого факультета и курса
        System.out.println("|_|_|_|_|_|_|_|_|");
        System.out.println("|_|_|_|_|_|_|_|_|");
        System.out.println("Списки студентов для каждого факультета и курса");

        for (int i = 0; i < Library.faculty.length; i++) {
            for (int j = 1; j < 7; j++) {
                System.out.println("Факультет: " + Library.faculty[i] + " , Курс: " + j);
                counter = 0;
                for (int k = 0; k < n; k++) {
                    if (students[k].getFaculty().equals(Library.faculty[i]) && students[k].getCourse() == j) {
                        System.out.println(students[k]);
                        counter = 1;
                    }
                }
                if (counter == 0)
                    System.out.println("По заданному факультету и курсу студентов НЕТ");
            }
            counter = 0;
        }
        System.out.println("|_|_|_|_|_|_|_|_|");
        System.out.println("|_|_|_|_|_|_|_|_|");
        //список студентов, родившихся после заданного года
        counter = 0;
        System.out.println("Список студентов, родившихся после заданного года: Будет после 1999 ");
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(students[i].getDate().substring(students[i].getDate().length()-4)) > 1999) {
                System.out.println(students[i]);
                counter = 1;
            }
        }
        if (counter == 0)
            System.out.println("студентов сторше НЕТ");
        System.out.println("|_|_|_|_|_|_|_|_|");
        System.out.println("|_|_|_|_|_|_|_|_|");
        //список учебной группы.
        System.out.println("список учебной группы: Например Информатический факультет 1 курса 1 группы");
        students[1].setFaculty(Library.faculty[0]);
        students[1].setCourse(1);
        students[1].setGroup(1);
        for (int i = 0; i < n; i++) {
            if (students[i].getFaculty().equals("Faculty of Computer Science") && students[i].getCourse() == 1 && students[i].getGroup() == 1) {
                System.out.println(students[i]);
                counter = 1;
            }
        }
        //  Лабораторная работа 3 - Вариант 2 - Задание 2
        System.out.println("|_|_|_|_|_|_|_|_|");
        System.out.println("|_|_|_|_|_|_|_|_|");
        // Реализованно через тех же студентов с добавлением 2 полей
        // Список покупателей в алфавитном порядке
        System.out.println("Список покупателей в алфавитном порядке:");
        String[][] array = new String[2][n];
        for (int i = 0; i < n; i++) {
            array[0][i] = String.valueOf(students[i].getId());
            array[1][i] = students[i].getFirst_name();
        }
        Library.print_array(array);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if (students[j].getFirst_name().compareTo(students[j+1].getFirst_name()) > 0){
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(students[i]);
        }

        // Список покупателей, у которых номер кредитной карточки находится в заданном интервале.
        System.out.println("|_|_|_|_|_|_|_|_|");
        System.out.println("|_|_|_|_|_|_|_|_|");
        counter =0;
        System.out.println("Список Покупателей/Студентов c номером карты в диапазоне с 1000000000000000 - 4000000000000000: ");
        long start_number =  Long.parseLong("1000000000000000");
        long end_number =  Long.parseLong("4000000000000000");
        for (int i = 0; i < n; i++) {
            if (students[i].getCard() > start_number && students[i].getCard() < end_number) {
                System.out.println(students[i]);
                counter = 1;
            }
        }
        if (counter == 0)
            System.out.println("По заданному промежутку никого нет");
        System.out.println("|_|_|_|_|_|_|_|_|");
        System.out.println("|_|_|_|_|_|_|_|_|");
        // Лабораторная работа 3 - Вариант 3 - Задание 1
        // Создать объект класса Текстовый файл, используя класс Файл.
        // Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
        // создать
        TextFile textFile = new TextFile("TestFile");
        //дополнить
        textFile.append("xXx");
        textFile.rename("eee");
        textFile.append("xXx");
        textFile.append("1xXx");
        // вывести на консоль содержимое
        textFile.print();
        // переименовать

        textFile.append("1xXx");
        textFile.append("1xXx33");
        textFile.print();
        //удалить
        //textFile.delete();
        // Лабораторная работа 3 - Вариант 3 - Задание 2
        // Создать объект класса Одномерный массив, используя класс Массив.
        // Методы: создать, вывести на консоль, выполнить операции (сложить, вычесть, перемножить).
        System.out.println("|_|_|_|_|_|_|_|_|");
        System.out.println("|_|_|_|_|_|_|_|_|");
        OneArray oneArray = new OneArray(n);
        oneArray.print();
        System.out.println(oneArray.sum(0, 1));
        System.out.println(oneArray.sub(0, 1));
        System.out.println(oneArray.mult(0, 1));
        // 4 Вариант - Задание 1

        Course course = new Course();
        System.out.println("список того что получилось: ");
        for (int i = 0; i < n; i++) {
            course.Course_set(i);
        }
        //список того что получилось.
        System.out.println("список того что получилось: ");

        for (int i = 0; i < n; i++) {
                System.out.println(course.toString(i));
        }
















    }


}
