package com.file.ya.РаботаСМассивом;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;


public class ВВодМассиваСКонсоли {


    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        System.out.println("введите строки");
           String[] myList = {"1","2","3"};
//        String[] myList = new String[3];

        for (int i = 0; i < myList.length; i++) {
            String s = reader.readLine();
            myList[i] = s;
            System.out.println(s);
        }
        for (int j = 0; j < myList.length; j++) {
            int u = myList.length - j - 1;
            System.out.println(j + myList[u]);
        }


    }
}


