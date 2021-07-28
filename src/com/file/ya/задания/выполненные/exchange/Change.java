package com.file.ya.задания.выполненные.exchange;


public class Change {

    public static void main(String[] args) {

        Converter converter = new Converter(2.52, 3.15, 11);

        System.out.println(converter.результатКонверсииВДоллар);
        System.out.println(converter.результатКонверсииВЕвро);
    }
}
