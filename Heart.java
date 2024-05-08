//Java Program
//File: Heart

import java.util.Scanner;

class Heart {
    public static void main(String[] args) {

    do {
        int stroka = 0;
        int stroka2 = 0;
        int rjad = 1;
        int kontrollrjad = 0;
        int probel = 0;
        int minusrjad = 0;
        int minusrjadHelp = 0;

        int kolvo0 = 0;
        int kolvo0Help = 0;
        int kolvo = 0;
        int kolvoHelp = 0;

        Scanner scanner = new Scanner(System.in);

        //Рисуем первую половину
        System.out.print("Какого размера будет сердце? ");
        int userAnswer = scanner.nextInt();

        if (userAnswer > 3) {
            userAnswer = userAnswer / 2;

            //Генерируем пробелы
            stroka2 = userAnswer;
            do {

                probel = (stroka2 - 1);
                if (probel > 0) {
                    do {
                        kolvo0 = kolvo0 + 2;
                        System.out.print(" ");
                        probel--;
                    } while (probel != 0);
                }

                //Находим сколько * надо убрать
                minusrjad = ((userAnswer * 2) / 5) * ((userAnswer * 4) / 10);

                //Генерируем *
                do {

                    if (minusrjadHelp >= minusrjad) {
                        System.out.print("*");
                        kolvo++;
                        kontrollrjad = kontrollrjad + 1;
                    } else if (minusrjadHelp < minusrjad) {
                        System.out.print(" ");
                        minusrjadHelp++;
                        kontrollrjad = kontrollrjad + 1;
                    } else {
                    }

                } while (kontrollrjad < rjad);


                //Генерируем 2 раз пробел
                kolvo0++;
                do {

                        kolvo0Help++;
                        System.out.print(" ");

                } while (kolvo0Help < kolvo0);


                //Генерируем 2 раз *
                do {
                    if (kolvo != kolvoHelp) {
                        kolvoHelp++;
                        System.out.print("*");
                    }
                } while (kolvoHelp < kolvo);


                kontrollrjad = 0;
                rjad = rjad + 2;
                System.out.println();
                stroka++;
                stroka2--;
            } while (stroka < userAnswer);


    //Генерируем низ
        userAnswer = userAnswer * 2;
        //Количество * в ряду
        int rjad_3 = 0;
        int rjad_3Help = 0;

        //Количество рядов
        int rjad2_3 = 0;
        int rjad2_3Help = 0;

        //Количество пробелов
        int probel_3 = 0;
        int probel_3Help = 0;


        rjad_3 = userAnswer;
        rjad_3 = rjad_3 + rjad_3 - 1;

    do {


        //Генерируем пробелы
        do {
            if (probel_3 > 0) {
                System.out.print(" ");
                probel_3Help++;
            }
        } while (probel_3Help < probel_3);


        //Генерируем *
        do {
            System.out.print("*");
            rjad_3Help++;
        } while (rjad_3Help < rjad_3);

        probel_3Help = 0;
        probel_3++;

        rjad_3 = rjad_3 - 2;
        rjad_3Help = 0;
        System.out.println();
        rjad2_3 = userAnswer;
        rjad2_3Help++;
    } while (rjad2_3Help < rjad2_3);


        } else {
            System.out.println("Число должно быть больше!");
        }

    System.out.println();
    } while (1 == 1);

    }
}
