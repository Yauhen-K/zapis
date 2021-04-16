package com.file.ya.лист;

import java.util.ArrayList;
import java.util.List;

public class СуммБольшеТрёхВЛисте {

  public static void main(String[] args) {
    List<Integer> myArr = new ArrayList<>();
    myArr.add(1);
    myArr.add(2);
    myArr.add(3);
    myArr.add(5);
    myArr.add(10);
//        myArr.add(10);     Тут есть вопросы.
//        myArr.add(10);
//        myArr.add(10);
//        myArr.add(10);
//        myArr.add(10);
//        myArr.add(10);
//        myArr.add(10);
//        myArr.add(10);
//        myArr.add(10);
    Integer summ = 0;

//    for (int i = 0; i < myArr.size(); i++) {

        for (Integer i : myArr) { // не работает фор ич
        if (i > 3) {
            summ = summ + i;
        }

    }
    System.out.println(summ);

}
}


