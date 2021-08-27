package com.file.ya.задания.выполненные.exchange;


public class Change {

    public static void main(String[] args) {

        Converter converter = new Converter(2.52, 3.15);
        double обмен21руб = converter.exchangeEur(21);
        double обмен22руб = converter.exchangeEur(22);
        double обмен23руб = converter.exchangeEur(23);
        double обмен24руб = converter.exchangeEur(24);
        double обмен25руб = converter.exchangeUsd(25);
        double обмен26руб = converter.exchangeUsd(26);
        double обмен27руб = converter.exchangeUsd(27);
        double обмен28руб = converter.exchangeUsd(28);


        System.out.println("При обмене 21 бел руб на евро получим " + обмен21руб + " евро");
        System.out.println("При обмене 22 бел руб на евро получим " + обмен22руб + " евро");
        System.out.println("При обмене 23 бел руб на евро получим " + обмен23руб + " евро");
        System.out.println("При обмене 24 бел руб на евро получим " + обмен24руб + " евро");
        System.out.println("При обмене 25 бел руб на доллары получим " + обмен25руб + " долларов");
        System.out.println("При обмене 26 бел руб на доллары получим " + обмен26руб + " долларов");
        System.out.println("При обмене 27 бел руб на доллары получим " + обмен27руб + " долларов");
        System.out.println("При обмене 28 бел руб на доллары получим " + обмен28руб + " долларов");
    }
}
