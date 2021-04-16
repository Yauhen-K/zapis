package com.file.ya.задания.выполненные.дробить2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleReader {

    private List<Integer> even;
    private List<Integer> odd;
    private int[] numbers;

    public void read() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int command = s.nextInt();
        numbers = new int[command];
        for (int i = 0; i < numbers.length; i++) { //Принимаем все числа массива
            System.out.println("Enter" + " " + i + " " + "number of the array");
            numbers[i] = s.nextInt();
        }
        s.close();
    }

    public void fillEvenAndOdd() {
        even = new ArrayList<>();
        odd = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                even.add(number);
            } else {
                odd.add(number);
            }
        }
    }

    public List<Integer> getEven() {
        return even;
    }

    public List<Integer> getOdd() {
        return odd;
    }
}
