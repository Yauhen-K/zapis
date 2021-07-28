package com.file.ya.задания.выполненные.изменениеРегистра;

public class Start {
    public static void main(String[] args) {
        IncreaseLetters letters = new IncreaseLetters();

        letters.name = "  ВаCя";
        letters.text = " Привет";

        String ap = letters.ApLetters(letters.name);

        String st = letters.sum(ap );


        System.out.println(st);


    }
}
