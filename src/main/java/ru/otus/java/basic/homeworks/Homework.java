package ru.otus.java.basic.homeworks;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        //Получение номера задания от пользователя
        //int task = getNumberOfTask();
        Scanner newScanner = new Scanner(System.in);
        //Обработка исключений в случае ввода некорректного номера.
        /*while (task < 1 || task > 5) {
            System.out.println("Ошибка! Вы ввели некорректный номер задания. Повторите попытку.\n-------------");
            task = getNumberOfTask();
        }*/
        /*if (task == 1) {
            greetings();
        } else if (task == 2) {
            System.out.println("Для выполнения данного задания потребуются конкретные значения." +
                    "\nВы бы хотели задать их самостоятельно? (Ответ в формате Да/Нет)");
            String answer = getUserInput.toString();
            while (answer != "Да" & answer != "Нет") {
                System.out.println("Ошибка! Вы ввели ответ в некорректном формате. Повторите попытку.\n-------------");
                answer = getUserInput.toString();
            }
        }*/


        /*//Выполнение задания (1)
        greetings();
        System.out.println("---------------------");
        //Выполнение задания (2)
        Scanner getUserInput = new Scanner(System.in);
        System.out.println("Введите число a:");
        int a = getUserInput.nextInt();
        System.out.println("Введите число b:");
        int b = getUserInput.nextInt();
        System.out.println("Введите число c:");
        int c = getUserInput.nextInt();
        checkSign(a,b,c);
        System.out.println("---------------------");
        //Выполнение задания (3)
        selectColor();
        System.out.println("---------------------");
        //Выполнение задания (4)*/
    }

    //Метод для запроса номера задания от пользователя
    public static int getNumberOfTask() {
        Scanner getUserInput = new Scanner(System.in);
        int taskNumber = getUserInput.nextInt();
        System.out.println("Приветствую!\nПожалуйста, выберите номер задания:");
        if (taskNumber == 1) {
            System.out.println("Вы выбрали задание 1.");
        } else if (taskNumber == 2) {
            System.out.println("Вы выбрали задание 2.");
        } else if (taskNumber == 3) {
            System.out.println("Вы выбрали задание 3.");
        } else if (taskNumber == 4) {
            System.out.println("Вы выбрали задание 4.");
        } else if (taskNumber == 5) {
            System.out.println("Вы выбрали задание 5.");
        }

        return taskNumber;
    }

    //Метод для выполнения задания (1)
    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    //Метод для выполнения задания (2)
    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительна");
        } else {
            System.out.println("Сумма отрицательна");
        }
    }

    //Метод для выполнения задания (3)
    public static void selectColor(int data) {
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 & data <= 20) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    //Метод для выполнения задания (4)
    public static void compareNumbers() {
        System.out.println("h");
    }
}
