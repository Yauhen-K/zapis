package com.file.ya.раздробитьЗадание2;

import com.file.ya.раздробленное.MinMaxFinder;

import javax.print.event.PrintEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ВводСКонсоли {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int command = s.nextInt();
        int[] numbers = new int[command];
        for (int i = 0; i < numbers.length; i++) { //Принимаем все числа массива
            System.out.println("Enter" + " " + i + " " + "number of the array");
            numbers[i] = s.nextInt();
        }


        List<Integer> even = new ArrayList<Integer>();
        List<Integer> odd = new ArrayList<Integer>();


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even.add(numbers[i]);
            } else {
                odd.add(numbers[i]);
            }


        }
        System.out.println("Array of even numbers is: " + even);
        System.out.println("Array of odd numbers is: " + odd);

        print(even);
        print2(odd);
    }


    public static void print(List<Integer> even) {
        Четные четные = new Четные();
        Integer sumEven = четные.суммЧет(even);
        System.out.println("The sum of even numbers is " + sumEven);
    }


    public static void print2(List<Integer> odd) {
        НеЧетные неЧетные = new НеЧетные();
        Integer sumOdd = неЧетные.суммНеЧет(odd);
        System.out.println("The sum of odd numbers is " + sumOdd);
    }

}
