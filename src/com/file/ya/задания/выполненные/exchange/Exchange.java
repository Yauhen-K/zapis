package com.file.ya.задания.выполненные.exchange;

public class Exchange {
    public static void main(String[] args) {
        CurrencyExchange exchange =new CurrencyExchange();
        double curs = exchange.currencyExchange( 156);
        System.out.println(curs);
    }
}
