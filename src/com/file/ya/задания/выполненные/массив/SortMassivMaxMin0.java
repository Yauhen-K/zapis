package com.file.ya.задания.выполненные.массив;

import java.util.Arrays;


public class SortMassivMaxMin0 {

        public static void main(String[] args) {
            int myArr [] = {2, 4, 3, 1, 5, -1, 0, 9, 6, 7, 8, 10};

            for (int i = 0; i < myArr.length - 1; i++) {
                for (int j = 0; j < myArr.length - 1 - i; j++) {
                    if (myArr[j] < myArr[j + 1]){
                        замена(myArr, j);
                    }
                }
                System.out.println(Arrays.toString(myArr));
            }
        }

        private static void замена(int myArr[], int i) {
            int t = myArr[i];
            myArr[i] = myArr[(i + 1)];
            myArr[(i + 1)] = t;
        }
}
