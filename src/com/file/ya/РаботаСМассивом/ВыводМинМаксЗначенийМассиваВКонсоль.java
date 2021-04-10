package com.file.ya.РаботаСМассивом;

import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;

public class ВыводМинМаксЗначенийМассиваВКонсоль {
    public static void main(String[] args) {

//        int[] myMas = new int[]{10, 8, 7, 4, 5, 8};

        int[] myMas = {30, 20, 15, 2, 26, -1, 18, 150, 63, 4};
        int min = 0;
        int max = 0;
        for (int i = 0; i < myMas.length; i++) {
            min = Math.min(min, myMas[i]);
            max = Math.max(max, myMas[i]);
        }
        System.out.println("Минимальное значение массива " + min);
        System.out.println("Максимальное значение массива " + max);

//        используя методы Math.min и Math.max  выводим соответствующее значение.
//        вопрос, почему нет тела цикла?
///////////////////////////////////////////////////////////////////////////////////////////////////
//        int[] miMas = {30,20,15,2,26,-10,18,150,63,4};
//       OptionalInt max = Arrays.stream(miMas).min(); //??????????????????  что за функции?
//        System.out.println("Минимальное / максимальное значение" + max.getAsInt());
//////////////////////////////////////////////////////////////////////////////////////////////////////
//        Integer[] myArray = {30,20,15,2,26,-10,18,150,63,4};
//        Arrays.sort(myArray);
//        System.out.println(" Мин/ Макс "  + myArray[myArray.length - 1]);//   как вывести меньшее?
//        //////////////////////////////////////////////////////////////////////////


    }
}