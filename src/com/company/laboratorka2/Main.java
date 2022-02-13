package com.company.laboratorka2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Лабораторная работа 2 - Вариант 1 - Задание 1
        // В приведенных ниже заданиях необходимо вывести внизу фамилию разработчика, дату и время получения задания,
        // а также дату и время сдачи задания. Для получения последней даты и времени следует использовать класс Date.
        Date date = new Date();
        System.out.println("Фамилия разработчика: Авдонин. Дата получения 13.02.2022");
        System.out.println("Дата сдачи: " + date.toString());

        // Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
        System.out.println("Введите n строк через пробел, как надоест нажмите enter \n");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine().replace("  ", " ");
        String[] words = str.split(" ");
        String max_word = words[0];
        String min_word = words[0];
        for (String word : words) {
            if (max_word.length() < word.length())
                max_word = word;
            else if (min_word.length() > word.length())
                min_word = word;
        }
        System.out.println(max_word + " " + max_word.length());
        System.out.println(min_word+ " " + min_word.length());
        // Лабораторная работа 2 - Вариант 1 - Задание 2
        //Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.
        Arrays.sort(words);
        for (String word : words) {
            System.out.print(word + "  ");
        }
        System.out.println("- По возрастанию");
        Arrays.sort(words, Collections.reverseOrder());
        for (String word : words) {
            System.out.print(word + "  ");
        }
        System.out.println("- По убыванию");
        // Лабораторная работа 2 - Вариант 2 - Задание 1
        // Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
    }
}
