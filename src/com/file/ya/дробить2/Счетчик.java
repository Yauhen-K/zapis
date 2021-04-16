package com.file.ya.дробить2;

import java.util.List;

public class Счетчик {

    public static Integer сумм(List<Integer> list) {
        int sum = 0;

        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
}
