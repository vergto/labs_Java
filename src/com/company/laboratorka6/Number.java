package com.company.laboratorka6;

public class Number {
    private int i;
    private int j;
    private int n;

    public Number(int i, int j, int n){
        this.i = i;
        this.j = j;
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    @Override
    public String toString() {
        return "Number{" +
                "i=" + i +
                ", j=" + j +
                ", n=" + n +
                '}';
    }
}
