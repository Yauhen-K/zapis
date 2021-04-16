package com.file.ya.дробить2;

import java.util.List;

public class ВводСКонсоли {
    public static void main(String[] args) {
        ConsoleReader reader = new ConsoleReader();
        reader.read();
        reader.fillEvenAndOdd();

        List<Integer> even = reader.getEven();
        List<Integer> odd = reader.getOdd();

        System.out.println("Array of even numbers is: " + even);
        System.out.println("Array of odd numbers is: " + odd);

        printSum(even, "Sum of even");
        printSum(odd, "Sum of odd");
    }

    public static void printSum(List<Integer> integers, String message) {
        Integer sum = Счетчик.сумм(integers);
        System.out.println(message + ": " + sum);
    }
}