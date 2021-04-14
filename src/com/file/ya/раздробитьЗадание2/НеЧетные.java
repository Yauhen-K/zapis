package com.file.ya.раздробитьЗадание2;

import java.util.List;

public class НеЧетные {
    public Integer суммНеЧет(List<Integer> odd) {

        int sumOdd = 0;

        for (int i = 0; i < odd.size(); i++) {
            sumOdd = sumOdd + odd.get(i);

        }
        return sumOdd;
    }
}
