package com.file.ya.раздробленное;

import com.file.ya.раздробленное.MinMaxFinder;

public class ВыводВКонсольMinMaxЗначенийМассива {
    public static void main(String[] args) {
        int[] myArr = {-1, 0, 1, 2, 3, 4, -6, 7, 8, 10};

        printMinMax(myArr);
    }

    public static void printMinMax(int[] myArr) {
        MinMaxFinder finder = new MinMaxFinder();

        int min = finder.findMin(myArr);
        System.out.println("мин значение массива  " + min);

        int max = finder.findMax(myArr);
        System.out.println("макс значение массива  " + max);
    }
}