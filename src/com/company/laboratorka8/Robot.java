package com.company.laboratorka8;

public class Robot {
    public volatile boolean leg_flag = true;
    public static void main(String[] args){
        System.out.println("Start");
        new Robot().doStart();
    }
    void doStart() {
        new Thread(left).start();
        new Thread(right).start();
    }

    Runnable left = new Runnable() {
        @Override
        public void run() {
            while (true) {
                if (leg_flag) {
                    System.out.println("LEFT");
                    leg_flag = false;
                }
                Thread.yield();
            }
        }
    };

    Runnable right = new Runnable() {
        @Override
        public void run() {
            while (true){
                if (!leg_flag) {
                    System.out.println("RIGHT");
                    leg_flag = true;
                }
                Thread.yield();
            }
        }
    };

}
