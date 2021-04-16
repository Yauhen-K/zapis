package com.file.ya.лист;

import java.util.ArrayList;
import java.util.List;

public class КоличествоТроекВЛисте {

        public static void main(String[] args) {
            List<Integer> myArr = new ArrayList<>();
            myArr.add(3);
            myArr.add(3);
            myArr.add(3);
            myArr.add(10);
            myArr.add(10);
            myArr.add(10);
            myArr.add(10);
            myArr.add(10);
            myArr.add(10);
            myArr.add(10);
            myArr.add(10);
            myArr.add(10);
            myArr.add(10);
            Integer summ = 0;

            for (int i = 0; i < myArr.size(); i++) {


                if (myArr.get(i) == 3) {
                    summ ++;
                }

            }
            System.out.println(summ);

        }
    }




