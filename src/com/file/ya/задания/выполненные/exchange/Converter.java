package com.file.ya.задания.выполненные.exchange;

public class Converter {
    private double курсДоллара;
    private double курсЕвро;


    public Converter(double курс$, double курсE) {
        курсДоллара = курс$;
        курсЕвро = курсE;
    }

    double exchangeUsd(double суммБелРуб) {
        return суммБелРуб / курсДоллара;
    }

    double exchangeEur(double суммБелРуб) {
        return суммБелРуб / курсЕвро;
    }
}
