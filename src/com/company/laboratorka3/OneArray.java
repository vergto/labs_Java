package com.company.laboratorka3;

import java.util.Arrays;

abstract class MyArray {

    abstract void print();
    abstract int sum(int x, int y);
    abstract int mult(int x, int y);
    abstract int sub(int x, int y);
}

public class OneArray extends MyArray {
    private int[] arrays;
    public OneArray(int x) {
        arrays = new int[x];
        for (int i = 0; i < x; i++) {
            arrays[i] = (int) (Math.random()*10);
        }
    }

    @Override
    void print() {
        System.out.println(Arrays.toString(arrays));
    }

    @Override
    int sum(int x, int y) {
        return arrays[x]+arrays[y];
    }

    @Override
    int mult(int x, int y) {
        return arrays[x]*arrays[y];
    }

    @Override
    int sub(int x, int y) {
        return arrays[x]-arrays[y];
    }

}
