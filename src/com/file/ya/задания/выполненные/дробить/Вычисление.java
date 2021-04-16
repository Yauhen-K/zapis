package com.file.ya.задания.выполненные.дробить;

public class Вычисление {



    public int суммНеЧёт(int[] myMas) {

        int sumOdd = 0;

        for (int i = 0; i < myMas.length; i++) {
            if (myMas[i] % 2 != 0) {
                sumOdd = sumOdd + myMas[i];
            }

        }
        return sumOdd;
    }



    public int суммЧёт(int[] myMas) {
        int sumEven = 0;
        for (int i = 0; i < myMas.length; i++) {
            if (myMas[i] % 2 == 0) {
                sumEven = sumEven + myMas[i];
            }

        }
        return sumEven;
    }


    public int суммX(int[] myMas) {
        int sumX = 0;
        for (int i = 0; i < myMas.length; i++) {
            if (i == myMas.length - 1 || i == myMas.length - 2) { // тут надо пояснение
                sumX = sumX + myMas[i];
            }
        }
        return sumX;
    }
}


