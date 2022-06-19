package com.company.laboratorka6;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Lab6 {
// Лаба 6 Вариант 1 задача 1
// Списки (стеки, очереди) I(1..n) и U(1..n) содержат результаты n измерений тока
// и напряжения на неизвестном сопротивлении R.
// Найти приближенное число R методом наименьших квадратов.


//    public static double mnk(Stack<Double> X, Stack<Double> Y, int n)
//    {
//        double sx2, sxy, buf_u, buf_i;
//        sx2 = sxy = 0.0;
//        for (int i = 0; i < n; i++)
//        {
//            // Вытаскиваем диски из пирамидки
//            buf_u = Y.pop();
//            buf_i = X.pop();
//
//            sx2+=buf_i * buf_i;
//            sxy+=buf_i * buf_u;
//        }
//
//        return sxy/sx2;
//    }
//
//    public static void main(String[] args){
//        //создаем пирамидку последний вошел - первый вышел
//        Stack<Double> ii = new Stack<>();
//        Stack<Double> uu = new Stack<>();
//        for(int i = 1; i <= 10; i++){
//            ii.push(((double) i)/10);
//        }
//        // надеваем на пирамидку диски
//        uu.push(0.27);
//        uu.push(0.56);
//        uu.push(10.9);
//        uu.push(1.18);
//        uu.push(1.49);
//        uu.push(1.79);
//        uu.push(2.05);
//        uu.push(2.42);
//        uu.push(2.68);
//        uu.push(3.01);
//
//
//        double q = mnk(ii, uu,10);
//        System.out.println("R=" + q);
//    }

// Лаба 6 Вариант 1 задача 2
// С использованием множества выполнить попарное суммирование произвольного конечного ряда чисел по следующим правилам:
// на первом этапе суммируются попарно рядом стоящие числа,
// на втором этапе суммируются результаты первого этапа и т.д. до тех пор, пока не останется одно число.

//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите количество чисел: ");
//        int n, a, c;
//        // считаем сколько раз пользователь ввел n
//        if (scanner.hasNextInt()){
//            n = scanner.nextInt();
//        } else {
//            System.out.println("error");
//            n = - 1;
//        }
//        // Создаем отсортированное и упорядоченное дерево
//        TreeSet<Integer> integerTreeSet = new TreeSet<>();
//        for (int i = 0; i < n; i++){
//            System.out.print("Введите число " + i + ": ");
//            if (scanner.hasNextInt()){
//                integerTreeSet.add(scanner.nextInt());
//            } else {
//                System.out.println("error");
//            }
//        }
//        System.out.println("Исходное множество: " + integerTreeSet);
//        //Копируем наше дерево в итератор
//        Iterator<Integer> iterator = integerTreeSet.iterator();
//        // в цикле от 1 до n-1 итератором проходимся и состав
//        for(int i = 0; i < n-1; i++){
//            TreeSet<Integer> buf = new TreeSet<>();
//            if(iterator.hasNext()){
//                a = iterator.next();
//            } else {
//                System.out.println("error");
//                a = -1;
//            }
//            // Идем по ряду в буфер добавляем сумму i и i+1
//            while(iterator.hasNext()){
//                c = a;
//                a = iterator.next();
//                buf.add(c + a);
//            }
//            System.out.println("Промужеточное множество: " + buf);
//            iterator = buf.iterator();
//        }
//    }

// Лаба 6 Вариант 2 задача 1
// Реализовать класс, моделирующий работу N-местной автостоянки.
// Машина подъезжает к определенному месту и едет вправо, пока не встретится свободное место.
// Класс должен поддерживать методы, обслуживающие приезд и отъезд машины.

//    public static void main(String[] args){
//        Parking parking = new Parking();
//        Parking.Car car_1 = new Parking.Car("1");
//        Parking.Car car_2 = new Parking.Car("2");
//        Parking.Car car_3 = new Parking.Car("3");
//        Parking.Car car_4 = new Parking.Car("4");
//        Parking.Car car_5 = new Parking.Car("5");
//        car_1.parking();
//        car_2.parking();
//        car_3.parking();
//        car_4.parking();
//        car_5.parking();
//
//        car_3.leaving();
//
//        System.out.println(parking);
//    }



// Лаба 6 Вариант 2 задача 2
// Во входном файле хранятся две разреженные матрицы А и В.
// Построить циклически связанные списки СА и СВ, содержащие ненулевые элементы соответственно матриц А и В.
// Просматривая списки, вычислить: а) сумму S = A + B; б) произведение P = A * B.

    public static void main(String[] args) throws IOException {
        Path in_path = Paths.get("./matrix.txt");
        LinkedList<Number> CA = new LinkedList<>();
        LinkedList<Number> CB = new LinkedList<>();
        LinkedList<Number> S = new LinkedList<>();
        LinkedList<Number> P = new LinkedList<>();

        Scanner scanner = new Scanner(in_path);
        scanner.useDelimiter(System.getProperty("line.separator"));
        String line;
        String[] split_line;
        int ii = 0, jj = 0, n = 0;
        while (scanner.hasNext()){
            jj = 0;
            line = scanner.next();
            if (line.isEmpty()){
                break;
            }
            split_line = line.split(" ");
            n = split_line.length;
            for (int j = 0; j < n; j++){
                if (!(Integer.parseInt(split_line[j]) == 0)) {
                    CA.add(new Number(ii, jj, Integer.parseInt(split_line[j])));
                }
                jj++;
            }
            ii++;
        }
        ii = jj = 0;
        while (scanner.hasNext()){
            jj = 0;
            line = scanner.next();
            split_line = line.split(" ");
            for (String sym : split_line){
                if (!(Integer.parseInt(sym) == 0)) {
                    CB.add(new Number(ii, jj, Integer.parseInt(sym)));
                }
                jj++;
            }
            ii++;
        }

        int iter_A = 0, iter_B = 0;
        boolean flag_A = true, flag_B = true;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                try{
                    CA.get(iter_A);
                }catch (Exception e){
                    flag_A = false;
                }
                try {
                    CB.get(iter_B);
                } catch (Exception e){
                    flag_B = false;
                }
                if ((flag_A && flag_B) && CA.get(iter_A).getI() == i && CA.get(iter_A).getJ() == j &&
                        CB.get(iter_B).getI() == i && CB.get(iter_B).getJ() == j){
                    S.add(new Number(i, j,CA.get(iter_A).getN() + CB.get(iter_B).getN()));
                    iter_A++;
                    iter_B++;
                } else if ((flag_A) && CA.get(iter_A).getI() == i && CA.get(iter_A).getJ() == j){
                    S.add(new Number(i, j, CA.get(iter_A).getN()));
                    iter_A++;
                } else if (flag_B && CB.get(iter_B).getI() == i && CB.get(iter_B).getJ() == j){
                    S.add(new Number(i, j, CB.get(iter_B).getN()));
                    iter_B++;
                } else {
                    S.add(new Number(i, j, 0));
                }
            }
        }


        int multi_buf = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){

                for (Number value : CA) {
                    for (Number number : CB) {
                        if (value.getI() == i && value.getJ() == number.getI() &&
                                number.getJ() == j) {
                            multi_buf += value.getN() * number.getN();
                        }
                    }
                }
                P.add(new Number(i, j, multi_buf));
                multi_buf = 0;
            }
        }

        System.out.println(CA);
        System.out.println(CB);
        System.out.println(S);
        System.out.println(P);
    }
}
