package com.file.ya;

public class MinMax {
    public static void main(String[] args) {
        int[] myArr = {-1, 0, 1, 2, 3, 4,-6, 7, 8, 10};

        int min = myArr[0];
        int max = myArr[0];

        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] > max) {
                max = myArr[i];
            }
        }
        System.out.println("макс значение массива  " + max);

        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] < min) {
                min = myArr[i];
            }
        }
        System.out.println("мин значение массива  " + min);
    }
}