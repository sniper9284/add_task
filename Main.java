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
        System.out.println("Введите число от 0 до 10");
        int y = check.nextInt();

        //сравниваем число пользователя и рандомное
        if (x < y) {
            System.out.println("Ваше число больше. Компьютер загадал " + x);
        } else if (y < x) {
            System.out.println("Ваше число меньше. Компьютер загадал " + x);
        } else if (x == y) {
            System.out.println("Вы угадали! Поздравляю");
        }
    }

}