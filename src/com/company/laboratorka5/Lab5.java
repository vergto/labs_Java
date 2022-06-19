package com.company.laboratorka5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.spec.ECField;
import java.util.*;


public class Lab5 {
//        public static void isCollinear_Orthogonal(Vector v1, Vector v2){
//        try {
//            boolean isCollinear = true;
//            ArrayList<Double> ratio = new ArrayList<>();
//            for (int i = 0; i < v1.getN(); i++) {
//                if ((v1.getData().get(i) != 0 && v2.getData().get(i) == 0) ||
//                        (v2.getData().get(i) == 0 && v1.getData().get(i) != 0)) {
//                    isCollinear = false;
//                    break;
//                }
//                if (v1.getData().get(i) == 0 && v2.getData().get(i) == 0) {
//                    break;
//                }
//                ratio.add(v1.getData().get(i) / v2.getData().get(i));
//            }
//            for (int i = 0; i < v1.getN() - 1; i++) {
//                if (!Objects.equals(ratio.get(i), ratio.get(i + 1))) {
//                    isCollinear = false;
//                    break;
//                }
//            }
//            if (isCollinear) {
//                System.out.println("Вектора коллинеарны");
//            } else if (v1.scalar(v2) == 0) {
//                System.out.println("Вектора ортогональны");
//            } else {
//                System.out.println("Вектора не коллинеарны и не ортогональны");
//            }
//        }
//        catch (Exception e){
//            System.out.println("Ошибка размерности");
//        }
//    }
//
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int number, dimension;
//        System.out.print("Введите количество векторов: ");
//        try {
//            number = scanner.nextInt();
//        }
//        catch (Exception e){
//            System.out.println("error");
//            number = -1;
//        }
//
//        System.out.print("Введите размерность: ");
//        try {
//            dimension = scanner.nextInt();
//        }
//        catch (Exception e){
//            System.out.println("error");
//            dimension = -1;
//        }
//
//        Vector[] vector_array = new Vector[number];
//        Vector first, second;
//        double[] coords = new double[dimension];
//        System.out.println("Введите координаты векторов: ");
//        for (int i = 0; i < number; i++){
//            System.out.println("Вектор " + i);
//            for (int j = 0; j < dimension; j++) {
//                try {
//                 coords[j] = scanner.nextDouble();
//                } catch (Exception e){
//                    System.out.println("error");
//                }
//            }
//            vector_array[i] = new Vector(coords);
//        }
//        System.out.println("Выберите два вектора:");
//        try {
//            first = vector_array[scanner.nextInt()];
//        } catch (Exception e){
//            first = new Vector(dimension);
//            System.out.println("error");
//        }
//        try {
//            second = vector_array[scanner.nextInt()];
//        } catch (Exception e){
//            second = new Vector(dimension);
//            System.out.println("error");
//        }
//        isCollinear_Orthogonal(first, second);
//    }


//    //Определить класс Вектор в R3. Реализовать методы для проверки векторов на ортогональность,
//    // проверки пересечения не ортогональных векторов, сравнения векторов.
//    // Создать массив из m объектов. Определить, какие из векторов компланарны.
//    public static void isCoplanar(VectorR3 v1, VectorR3 v2, VectorR3 v3){
//        double m = v1.getX() * v2.getY() * v3.getZ() + v1.getY() * v2.getZ() * v3.getX()
//                 + v1.getZ() * v2.getX() * v3.getY() - v1.getZ() * v2.getY() * v3.getX()
//                 - v1.getX() * v2.getZ() * v3.getY() - v1.getY() * v2.getX() * v3.getZ();
//        if (m == 0){
//            System.out.println("Вектора компланарны");
//        } else {
//            System.out.println("Вектора не компланарны");
//        }
//
//    }
//
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int number;
//        System.out.print("Введите количество векторов: ");
//        try {
//            number = scanner.nextInt();
//        } catch (Exception e){
//            System.out.println("error");
//            number = -1;
//        }
//        VectorR3[] vector_array = new VectorR3[number];
//        Random random = new Random();
//        double x1, x2, y1, y2, z1, z2;
//        System.out.println("Введите координаты векторов: ");
//        for (int i = 0; i < number; i++){
//            x1 = random.nextDouble();
//            x2 = random.nextFloat();
//            y1 = random.nextFloat();
//            y2 = random.nextFloat();
//            z1 = random.nextFloat();
//            z2 = random.nextFloat();
//            vector_array[i] = new VectorR3(x1, x2, y1, y2, z1, z2);
//        }
//
//        for (int i = 0; i < number; i++){
//            System.out.println("Вектор " + i + ": " + vector_array[i].toString());
//        }
//
//        for (int i = 0; i < number - 2; i++){
//            for (int j = i + 1; j < number - 1; j++){
//                for (int k = j + 1; k < number; k++){
//                    System.out.print("Вектора " + i + ", " + j + ", " + k + ": ");
//                    isCoplanar(vector_array[i], vector_array[j], vector_array[k]);
//                }
//            }
//        }
//
//    }



//    // Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
//    // Создать массив объектов. Вывести: a) список покупателей в алфавитном порядке;
//    // b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
//    public static void sorting(ArrayList<Customer> customers){
//        System.out.println("Сортировка:");
//        Comparator<Customer> CustomersComparator
//                = Comparator.comparing(Customer::getSurname);
//        customers.sort(CustomersComparator);
//        for (Customer customer:customers){
//            System.out.println(customer);
//        }
//    }
//
//    public static void credit_select(ArrayList<Customer> customers, long credit_start, long credit_end){
//        System.out.println("Карты из диапазона:");
//        for (Customer customer:customers){
//            if ((customer.getCredit_card() > credit_start) && (customer.getCredit_card() < credit_end)){
//                System.out.println(customer);
//            }
//        }
//    }
//
//    public static void main(String[] args){
//        ArrayList<Customer> customers = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        int number;
//        System.out.print("Введите количество покупателей: ");
//        if (scanner.hasNextInt()) {
//            number = scanner.nextInt();
//        } else {
//            System.out.println("error");
//            number = -1;
//        }
//
//        for (int i = 0; i < number; i++){
//            Customer customer = new Customer();
//            try {
//                customer.setId(i + 1);
//            }
//            catch (MyException e){
//                System.out.println(e.toString());
//            }
//            System.out.println("Покупатель " + i + ":");
//            System.out.print("Введите фамилию: ");
//            if (scanner.hasNext()) {
//                try {
//                    customer.setSurname(scanner.next());
//                }
//                catch (MyException e){
//                    System.out.println(e.toString());
//                }
//            } else {
//                System.out.println("error");
//            }
//            System.out.print("Введите имя: ");
//            if (scanner.hasNext()) {
//                try {
//                    customer.setName(scanner.next());
//                }
//                catch (MyException e){
//                    System.out.println(e.toString());
//                }
//            } else {
//                System.out.println("error");
//            }
//            System.out.print("Введите отчество: ");
//            if (scanner.hasNext()) {
//                try {
//                    customer.setLastname(scanner.next());
//                }
//                catch (MyException e){
//                    System.out.println(e.toString());
//                }
//            } else {
//                System.out.println("error");
//            }
//            System.out.print("Введите номер карты: ");
//            if (scanner.hasNextLong()) {
//                try {
//                    customer.setCredit_card(scanner.nextLong());
//                }
//                catch (MyException e){
//                    System.out.println(e.toString());
//                }
//            } else {
//                System.out.println("error");
//            }
//            System.out.print("Введите номер счета: ");
//            if (scanner.hasNextLong()) {
//                customer.setBank_acc(scanner.nextLong());
//            } else {
//                System.out.println("error");
//            }
//            customers.add(customer);
//        }
//        sorting(customers);
//        credit_select(customers, 0,110000000 );
//
//    }




//    public static void same_diagnosis(ArrayList<Patient> patients, String diagnosis){
//        System.out.println("Пациенты с диагнозом: " + diagnosis);
//        for (Patient patient:patients){
//            if (patient.getDiagnosis().equals(diagnosis)){
//                System.out.println(patient);
//            }
//        }
//    }
//
//    public static void card_select(ArrayList<Patient> patients, long card_start, long card_end){
//        System.out.println("Карты из диапазона:");
//        for (Patient patient:patients){
//            if ((patient.getCard_number() > card_start) && (patient.getCard_number() < card_end)){
//                System.out.println(patient);
//            }
//        }
//    }
//
//    public static void main(String[] args){
//        ArrayList<Patient> patients = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        int number;
//        System.out.print("Введите количество пациентов: ");
//        if (scanner.hasNextInt()) {
//            number = scanner.nextInt();
//        } else {
//            System.out.println("error");
//            number = -1;
//        }
//
//        for (int i = 0; i < number; i++){
//            Patient patient = new Patient();
//            try {
//                patient.setId(i + 1);
//            }
//            catch (MyException e){
//                System.out.println(e.toString());
//            }
//            System.out.println("Покупатель " + i + ":");
//            System.out.print("Введите фамилию: ");
//            if (scanner.hasNext()) {
//                try {
//                    patient.setSurname(scanner.next());
//                }
//                catch (MyException e){
//                    System.out.println(e.toString());
//                }
//            } else {
//                System.out.println("error");
//            }
//            System.out.print("Введите имя: ");
//            if (scanner.hasNext()) {
//                try {
//                    patient.setName(scanner.next());
//                }
//                catch (MyException e){
//                    System.out.println(e.toString());
//                }
//            } else {
//                System.out.println("error");
//            }
//            System.out.print("Введите отчество: ");
//            if (scanner.hasNext()) {
//                try {
//                    patient.setLastname(scanner.next());
//                }
//                catch (MyException e){
//                    System.out.println(e.toString());
//                }
//            } else {
//                System.out.println("error");
//            }
//            System.out.print("Введите адрес: ");
//            if (scanner.hasNextLine()) {
//                patient.setAddress(scanner.next());
//            } else {
//                System.out.println("error");
//            }
//            scanner.next();
//            System.out.print("Введите телефон: ");
//            if (scanner.hasNext()) {
//                try {
//                    patient.setPhone(scanner.next());
//                }
//                catch (MyException e){
//                    System.out.println(e.toString());
//                }
//            } else {
//                System.out.println("error");
//            }
//            System.out.print("Введите номер карты: ");
//            if (scanner.hasNextLong()) {
//                patient.setCard_number(scanner.nextLong());
//            } else {
//                System.out.println("error");
//            }
//            System.out.print("Введите диагноз: ");
//            if (scanner.hasNext()) {
//                patient.setDiagnosis(scanner.next());
//            } else {
//                System.out.println("error");
//            }
//
//            patients.add(patient);
//        }
//        same_diagnosis(patients, "ОРВИ");
//        card_select(patients, 0,110000000 );
//    }


// Лаба 5 Вариант 3 задача 1

    public static void main(String[] args) throws IOException {
        Path in_path = Paths.get("./in_file.txt");
        Path out_path = Paths.get("./out_file.txt");

        Files.deleteIfExists(in_path);
        Files.deleteIfExists(out_path);

        Files.createFile(in_path);
        Files.createFile(out_path);

        String str_1 = "Подстрока";
        String str_2 = "";

        Scanner scanner = new Scanner(System.in);
        while(true) {
            String line = scanner.nextLine();
            if(line.isEmpty()){
                break;
            }
            int index = 0;
            try {
                Files.write(in_path, Collections.singleton(line), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            while (index != -1) {
                index = line.indexOf(str_1);
                if (index != -1){
                    line = line.replace(str_1, str_2);
                }
            }
            try {
                Files.write(out_path, Collections.singleton(line), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

// Лаба 5 Вариант 3 задача 2


//    public static void main(String[] args) throws IOException {
//        Path in_path = Paths.get("./in_file.txt");
//        Path out_path = Paths.get("./out_file.txt");
//
//        Files.deleteIfExists(in_path);
//        Files.deleteIfExists(out_path);
//
//        Files.createFile(in_path);
//        Files.createFile(out_path);
//
//        String str_1 = "привет";
//        String str_2 = ",";
//
//        Scanner scanner = new Scanner(System.in);
//        while(true) {
//            String line = scanner.nextLine();
//            if(line.isEmpty()){
//                break;
//            }
//            int index = 0;
//            try {
//                Files.write(in_path, Collections.singleton(line), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
//            } catch (IOException e) {
//                System.out.println(e.getMessage());
//            }
//            while (index != -1) {
//                index = line.indexOf(str_1);
//                if (index != -1){
//                    line = line.replace(str_1, str_2);
//                }
//            }
//            try {
//                Files.write(out_path, Collections.singleton(line), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
//            } catch (IOException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//    }


// Лаба 5 Вариант 4 задача 1

//    public static void main(String[] args) {
//        try
//        {
//            System.out.println("Введите текст программы (конец текста пустая строка)");
//            String program="";
//            String line="";
//            Scanner sc=new Scanner(System.in);
//            while(sc.hasNextLine())
//            {
//                line= sc.nextLine();
//                if(line.compareTo("")==0)//Если пустая строка
//                    break;
//                program=program+line+"\n";
//            }
//            program=program.replaceAll("public","private");
//            System.out.println(program);
//            File file=new File("MyDerictoriya");
//            file.mkdirs();
//            if(!file.exists())
//                throw new IOException("Не возможно создать дерикторию");
//            FileWriter writer=new FileWriter(file.toString()+"//output.txt");
//            writer.write(program);
//            writer.close();
//        }
//        catch (IOException ex)
//        {
//            System.out.println(ex.toString());
//        }
//    }

// Лаба 5 Вариант 4 задача 2

//    public static void main(String[] args) throws IOException {
//        Path in_path = Paths.get("./in_java.txt");
//        Path out_path = Paths.get("./out_java.txt");
//
//        Files.deleteIfExists(in_path);
//        Files.deleteIfExists(out_path);
//
//        Files.createFile(in_path);
//        Files.createFile(out_path);
//
//
//        Scanner scanner = new Scanner(System.in);
//        while(true) {
//            String line = scanner.nextLine();
//            if(line.isEmpty()){
//                break;
//            }
//
//            try {
//                Files.write(in_path, Collections.singleton(line), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
//            } catch (IOException e) {
//                System.out.println(e.getMessage());
//            }
//
//            StringBuilder out_line = new StringBuilder(line).reverse();
//
//            try {
//                Files.write(out_path, Collections.singleton(out_line), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
//            } catch (IOException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//    }

}
