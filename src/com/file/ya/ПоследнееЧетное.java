package com.file.ya;

public class ПоследнееЧетное {
    public static void main(String[] args) {

        int[]myArr={1,2,3,3,5,7,5,10,2,3};

        int последЧетное=0;

        for (int i = 0; i < myArr.length; i++) {

            if (myArr[i] % 2 == 0) {

                последЧетное= myArr[i];

            }
        }
        System.out.println(последЧетное);
    }
}
