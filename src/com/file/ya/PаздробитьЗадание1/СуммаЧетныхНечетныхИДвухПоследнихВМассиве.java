package com.file.ya.PаздробитьЗадание1;

public class СуммаЧетныхНечетныхИДвухПоследнихВМассиве {

    public static void main(String[] args) {

        int[] myMas = {3, 2, 3,6,8,2,2};

         ПечатьРузультата(myMas);

    }

    public static void ПечатьРузультата(int[] myMas){

        Вычисление да = new Вычисление();

        int sumEven = да.суммЧёт(myMas);
        System.out.println("Сумма четных  "+sumEven);
        int sumOdd = да.суммНеЧёт(myMas);
        System.out.println("Сумма нечетных  "+sumOdd);
        int sumX = да.суммX(myMas);
        System.out.println("Сумма х  "+sumX);


    }




}

