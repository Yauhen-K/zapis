package com.file.ya.РаботаСМассивом;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ВыводМассиваВКонсоль {

    public static void main(String[] args) {

//     int[] myMas = {1, 2, 3, 4, 5, 6, 55, 7, 8, 9, 0, -15};

        String[] myMas = {"1", "2", "3", "4", "5", "6", "55", "7", "8", "9", "0", "-15"};

        for (int j = 0; j < myMas.length; j++) {

            System.out.println("Выводим, элемент массива номер " + j + "  равен " + myMas[j]);
        }
        String myMasInt = Arrays.toString(myMas);  /// не работает ту стринг  статически й метод. смотреть.
        System.out.println(myMasInt);
    }
}