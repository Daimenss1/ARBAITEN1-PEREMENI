package ru.skypro;

public class Main {

    public static void main(String[] args) {
        byte a = 5;
        short b = 31000;
        int c = 1147657;
        long d = 910904554324090L;
        float f = 85.15f;
        double e = 2333333333333.307;



        float b1 = 78.2f;
        float b2 = 82.7f;
        System.out.println ( " *Задача 2 ");
        System.out.println("Общий вес бойцов " + (b1 + b2) + " кг ");
        System.out.println( "Разница веса бойцов " + (b2-b1) + " кг ");

        short banana_w = 5*80;
        short milk_w = 200/100 * 105;
        short icecreem_w = 2*100;
        short eggsraw_w = 4*70;
        int totalgr = banana_w + milk_w + icecreem_w + eggsraw_w;
        float totalkg = totalgr / 1000f;
        System.out.println( " *Задача 3 ");
        System.out.println( "В блендере смешано " + totalgr + " гр  или " + totalkg + " кг ");


        int Weight = 7*1000;
        int a250 = Weight / 250;
        int a500 = Weight / 500;
        int average = (a250+a500) / 2;
        System.out.println ( " * Задача 4 ");
        System.out.println ( " Для сброса веса по 250 гр/день понадобится " + a250 + " дней ");
        System.out.println ( " Для сброса веса по 500 гр/день понадобится " + a500 + " дней ");
        System.out.println ( " Для сброса веса в среднем потребуется " + average + " дней " );

        int Ma = 67760;
        int De = 83690;
        int Kr = 76230;
        float Mnew = Ma * (100 + 10) / 100;
        float Dnew = De * (100 + 10) / 100;
        float Knew = Kr * (100 + 10) / 100;
        System.out.println ( " * Задача 5 ");
        System.out.println ( " Зарплата Маши в год: до повышения     " + (Ma * 12) + " руб. После повышения: " + (Mnew * 12) + " руб." + "Годовой доход вырос на " + (( Mnew - Ma ) * 12) + " руб. ");
        System.out.println ( " Зарплата Дениса в год: до повышения   " + (De * 12) + " руб. После повышения: " + (Dnew * 12) + " руб." + "Годовой доход вырос на " + (( Dnew - De ) * 12) + " руб. ");
        System.out.println ( " Зарплата Кристины в год: до повышения " + (Kr * 12) + " руб. После повышения: " + (Knew * 12) + " руб." + "Годовой доход вырос на " + (( Knew - Kr ) * 12) + " руб. ");

    }
}




