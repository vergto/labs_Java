package com.company;

public class Library {
    public static void print_array(int[][] mas_int){
        for (int i=0;i < mas_int.length;i++,System.out.println(" ")){
            for (int j=0;j < mas_int[i].length;j++){
                if (mas_int [i][j] >= 0)
                    System.out.print(" "+mas_int [i][j]+" ");
                else
                    System.out.print(mas_int [i][j]+" ");
            }
        }
    }

}
