package com.company.laboratorka3.var4.part2;

public class Main {
    //Система Конструкторское бюро. Заказчик представляет Техническое Задание (ТЗ) на проектирование многоэтажного Дома.
    // Конструктор регистрирует ТЗ, определяет стоимость проектирования и строительства,
    // выставляет Заказчику Счет за проектирование и создает Бригаду Конструкторов для выполнения Проекта.
    public static void main(String[] args) {
        DesignBureau designBureau = new DesignBureau();
        Customer customer = new Customer("Sidirov", 5);
        customer.createSpecification(5, "Yellow");
        designBureau.mainDesigner.registration(customer.specifications[0], customer);
        System.out.println(designBureau.mainDesigner.projects[0].toString());
    }
}
