package com.file.ya.РаботаСМассивом;

public class КоличествоЧетНечетВМассиве {
    public static void main(String[] args) {

        int[] myArr = {1, 21, 3, 4, 5, 6, 7, 9};

        int чет = 0;
        int нечет = 0;

        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] % 2 == 0) {
                чет++;

            } else {
                нечет++;
            }
        }
        System.out.println("количество нечетных = " + нечет);
        System.out.println("количество четных =" + чет);


    }
}
