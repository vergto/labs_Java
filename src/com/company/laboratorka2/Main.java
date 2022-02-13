package com.company.laboratorka2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import com.company.Library;

public class Main {
    private static void toSwap(int[] first, int[] second){
        for (int i = 0; i < first.length; i++) {
            int temp = first[i];
            first[i] = second[i];
            second[i] = temp;
        }
    }
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
        System.out.println("Введите n: ");
        int n = in.nextInt();
        int[][] mas_int = new int[n][n];
        for (int i=0;i < n;i++){
            for (int j=0;j < n;j++){
                mas_int[i][j]= (int) Math.floor(Math.random() * (n - -n + 1)) + -n;
            }
        }
        //Вывожу матрицу
        System.out.println("\n Матрица n*n: ");
        Library.print_array(mas_int);
//        for (int i = 0; i < mas_int.length; i++) {
//            Arrays.sort(mas_int[i]);
//        }
//        System.out.println("Отсортированная матрица: ");
//        Library.print_array(mas_int);
        System.out.println("Введите k-ый столбец по которому производить упорядочивание: ");
        int k = in.nextInt();

        for (int out = n - 1; out >= 1; out--){  //Внешний цикл
            for (int inn = 0; inn < out; inn++){       //Внутренний цикл
                if(mas_int[inn][k] > mas_int[inn + 1][k])               //Если порядок элементов нарушен
                    toSwap(mas_int[inn], mas_int[inn + 1]);             //вызвать метод, меняющий местами
            }
        }
        Library.print_array(mas_int);

        for (int out = n - 1; out >= 1; out--){  //Внешний цикл
            for (int inn = 0; inn < out; inn++){       //Внутренний цикл
                if(mas_int[k][inn] > mas_int[k + 1][inn])               //Если порядок элементов нарушен
                    toSwap(mas_int[k], mas_int[k + 1]);             //вызвать метод, меняющий местами
            }
        }
        Library.print_array(mas_int);
        in.close();
    }
}
