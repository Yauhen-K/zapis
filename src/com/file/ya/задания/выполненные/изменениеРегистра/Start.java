package com.file.ya.задания.выполненные.изменениеРегистра;

public class Start {
    public static void main(String[] args) {
        IncreaseLetters letters = new IncreaseLetters();

        String name = " Вася";

        String largeRegister = letters.apLetters(name);

        String result  = letters.sum(largeRegister);


        System.out.println(result);


    }
}
