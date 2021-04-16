package com.file.ya.задания.выполненные.раздробленное;

public class MinMaxFinder {
    public int findMin(int[] myArr) {
        int min = myArr[0];
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] < min) {
                min = myArr[i];
            }
        }
        return min;
    }

    public int findMax(int[] myArr) {
        int max = myArr[0];
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] > max) {
                max = myArr[i];
            }
        }
        return max;
    }
}
