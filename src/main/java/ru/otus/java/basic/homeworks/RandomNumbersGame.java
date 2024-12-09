package ru.otus.java.basic.homeworks;

import java.util.Scanner;

public class RandomNumbersGame {


    public static void main(String[] args) {
        boolean answerStatus = true;
        int number = setNumber(getLimit());
        Scanner getUserInput = new Scanner(System.in);
        System.out.println("Число лежит в диапазоне от 0 до " + number + ".\n\nВведите число:");
        while (answerStatus) {
            if (getUserInput.nextInt() == number) {
                answerStatus = false;
                System.out.println("Вы угадали!");
            } else {
                System.out.println("Вы не угадали, попробуйте ещё раз. Нужное Вам число:" + number);
            }
        }
    }

    public static int setNumber(int limit) {
        int number = (int) (limit * Math.random());
        return number;
    }
    public static int getLimit() {
        Scanner getLimitFromUser = new Scanner(System.in);
        System.out.println("Введите верхнюю границу загадываемого числа:");
        int actualLimit = getLimitFromUser.nextInt();
        System.out.println("Вы ввели " + actualLimit + ". Значение сохранено.");
        return actualLimit;
    }
}
