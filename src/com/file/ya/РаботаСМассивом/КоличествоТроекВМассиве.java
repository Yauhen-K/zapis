package com.file.ya.РаботаСМассивом;

public class КоличествоТроекВМассиве {
    public static void main(String[] args) {
        int[] myArr = {1, 3, 1, 3, 2, 4, 3, 3, 5, 6, -3};

        int sumtri = 0;

        for (int i = 0; i < myArr.length; i++) {

            if (myArr[i] == 3) {


                sumtri++;


            }
        }
        System.out.println(sumtri);
    }
}
