package com.file.ya;

import java.util.Arrays;

public class SortMassivMinMax2 {
    public static void main(String[] args) {
        int[] myArr = {2, 4, 3, 1, 5, -1, 0, 9, 6, 7, 8, 10};
//        boolean sorted = false;
//        while (!sorted) {
//            sorted = true;

            for (int i = myArr.length - 1; i > 0; i--) {


                for (int j = 0; j < i; j++) {

                    if (myArr[j] > myArr[j + 1]) {

                        int t = myArr[j];
                        myArr[j] = myArr[j + 1];
                        myArr[j + 1] = t;

//                        sorted = false;
//                    }

                }
            }
                System.out.println(Arrays.toString(myArr));
            }


        }
    }















