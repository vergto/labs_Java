package com.company.laboratorka8;

import java.util.Random;

public class Magazin {
    public volatile int amount;
    Random random = new Random();

    public static void main(String[] args){
        System.out.println("Start");
        new Magazin().doStart();
    }
    void doStart() {
        amount = 0;
        new Thread(delivery).start();
        new Thread(purchase).start();
    }

    Runnable purchase = new Runnable() {
        @Override
        public void run() {
            while (true) {
                if (amount == 0) {
                    System.out.println("Недостаточно товара");
                } else {
                    amount--;
                    System.out.println("Текущий баланс товара = " + amount);
                }
                Thread.yield();
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    Runnable delivery = new Runnable() {
        @Override
        public void run() {
            while (true) {
                int sum = random.nextInt(100);
                amount += sum;
                System.out.println("Текущий баланс товара = " + amount);
                Thread.yield();
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };
}
