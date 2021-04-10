package com.file.ya.РаботаСЛистом;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class ВводВыводЭрейлистКонсоль {
    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        System.out.println(" введите данные в косоль");
        ArrayList<String> list =new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            String s = reader.readLine();
            list.add(s);

            for (int j = 0; j < list.size(); j++) {
                int u = list.size()-j-1;
                System.out.println(list.get(u));

            }
        }


    }


}
