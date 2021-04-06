package com.file.ya;


import java.util.Arrays;

public class SortMassivMinMax1 {
    public static void main(String[] args) {
        SortMassivMinMax1 sortMassiv = new SortMassivMinMax1();

        int[] myArr = {2, 4, 3, 1, 5, -1, 0, 9, 6, 7, 8, 10};
        sortMassiv.sortMyArray(myArr);

    }

    public void sortMyArray(int[] myArr) {

        for (int i = 0; i < myArr.length - 1; i++) {

            for (int j = 0; j < i; j++) {

                if (myArr[j] > myArr[j + 1]) {

                    int t = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] = t;

                }
            }

        }
        System.out.println(Arrays.toString(myArr));
    }
}














