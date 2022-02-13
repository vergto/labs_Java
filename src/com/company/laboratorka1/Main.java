package com.company.laboratorka1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Лабораторная работа 1 - Вариант 1 - Задание 1
        // Создать класс Hello, который будет приветствовать любого пользователя, используя командную строку.
        System.out.println("Hello User! What is your name? \n");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.printf("Hello %s \n", name);


        // Лабораторная работа 1 - Вариант 1 - Задание 2
        //Создать приложение, которое отображает в окне консоли аргументы командной строки метода main() в обратном порядке.
        for (int i = args.length-1; i >= 0; i--) {
            System.out.println(args[i]);
        }

        // Лабораторная работа 1 - Вариант 2 - Задание 1
        // Ввести с консоли n целых чисел и поместить их в массив. На консоль вывести:  Четные и нечетные числа.
        System.out.println("Введите n: ");
        int num = in.nextInt();
        System.out.printf("Длинна массива: %d \n", num);
        int[] mas = new int[num];
        //Вывод пустого массива
        for (int item : mas) {
            System.out.print(item);
            System.out.print(" ");
        }
        System.out.println(" - Пустой массив");
        // Заполняем массив
        System.out.println("Заполните массив через enter");
        for (int i = 0; i < mas.length; i++){
            mas[i] = in.nextInt();
        }
        for (int val : mas) {
            System.out.print(val);
            System.out.print(" ");
        }
        System.out.println(" - Заполненный массив");
        // НЕчетные
        for (int k : mas) {
            if (k % 2 != 0) {
                System.out.print(k);
                System.out.print(" ");
            }
        }
        System.out.println(" - Нечетные числа массива");
        // Четные
        for (int j : mas) {
            if (j % 2 == 0) {
                System.out.print(j);
                System.out.print(" ");
            }
        }
        System.out.println(" - Четные числа массива");
        // Лабораторная работа 1 - Вариант 2 - Задание 2
        //Наибольшее и наименьшее число.
        int max = mas[0];
        int min = mas[0];
        for (int ma : mas) {
            if (ma > max)
                max = ma;
            else if (ma < min)
                min = ma;
        }
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
        in.close();
    }
}
