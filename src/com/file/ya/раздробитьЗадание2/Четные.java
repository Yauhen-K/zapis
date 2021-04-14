package com.file.ya.раздробитьЗадание2;

import java.util.ArrayList;
import java.util.List;

public class Четные {
    public Integer суммЧет(List<Integer> even) {

        int sumEven = 0;

        for (int i = 0; i < even.size(); i++) {
            sumEven = sumEven + even.get(i);

        }
        return sumEven;
    }
}
