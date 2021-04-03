package ru.sniper;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //вызываем метод Рандом
        Random rand = new Random();
        //указываем диапазон min, max
        int min=0;
        int max=10;
        int x  =  min +  rand.nextInt(max - min + 1);
        //вызываем запрос числа от пользователя
        Scanner check = new Scanner(System.in);
        int use;
        boolean win = false;
        System.out.println( "- введите число от 1 до 10" );

        while (win == false) {

            System.out.println( "Ваше число:" );
            use = check.nextInt();

            min++;

            if (use == x) {
                win = true;
            }
            else if (use < x) {
                System.out.println("- Ваше число меньше\n");
            }
            else if (use > x) {
                System.out.println("- ваше число больше\n");
            }
        }
        System.out.println("\nВы победили, поздравляю!");
    }
}

