package com.file.ya.массив;

public class СумБольшеТрёхВМассиве {
    public static void main(String[] args) {

        int[] myArr = {6, 2, 3, 4, 5};

        int summ = 0;

        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] > 3) {
                summ = summ + myArr[i];

            }
        }
        System.out.println(summ);
    }
}
