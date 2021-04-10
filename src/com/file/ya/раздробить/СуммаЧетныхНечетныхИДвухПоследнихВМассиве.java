package com.file.ya.раздробить;

import java.util.List;

public class СуммаЧетныхНечетныхИДвухПоследнихВМассиве {

    public static void main(String[] args) {

        int[] myMas = {1,2,3};
        int sumEven = 0;
        int sumOdd = 0;
        int sumX = 0;

        for (int i = 0; i < myMas.length; i++) {
            if (i % 2 != 0) {
                sumOdd = sumOdd + myMas[i];
            } else {
                sumEven = sumEven + myMas[i];
            }

            if (i == myMas.length - 1 || i == myMas.length - 2) {
                sumX = sumX + myMas[i];
            }
        }

        System.out.println("Сумма нечетных  " + sumOdd);
        System.out.println("Сумма четных  " + sumEven);
        System.out.println("Сумма х  " + sumX);

    }
}
