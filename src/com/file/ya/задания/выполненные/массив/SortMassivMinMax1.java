package com.file.ya.задания.выполненные.массив;


import java.util.Arrays;

public class SortMassivMinMax1 {
    public static void main(String[] args) {

        int[] myArr = {2, 4, 3, 1, 5, -1, 0, 9, 6, 7, 8, 10};
        sortMyArray(myArr);
    }

    public static void sortMyArray(int[] myArr) {

        for (int i = 0; i < myArr.length - 1; i++) {

            for (int j = 0; j < i; j++) {

                if (myArr[j] > myArr[j + 1]) {

                    int t = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] = t;

                }
            }
            System.out.println(Arrays.toString(myArr));
        }


    }
}














