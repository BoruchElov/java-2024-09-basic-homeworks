package ru.otus.java.basic.homeworks;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        System.out.println("Приветствую!\nПожалуйста, выберите номер задания:");
        //Получение номера задания от пользователя и обработка исключений при вводе не целочисленных данных
        Scanner newScanner = new Scanner(System.in);
        int task = 0;
        while (true) {
            if (newScanner.hasNextInt()) {
                task = newScanner.nextInt();
                break;
            } else {
                System.out.println("Ошибка: вы ввели не число! Попробуйте снова.");
                newScanner.next();
                System.out.println("Пожалуйста, выберите номер задания:");
            }
        }
        //Обработка исключений в случае ввода некорректного номера.
        while (task < 1 || task > 5 ) {
            System.out.println("Ошибка! Вы ввели некорректный номер задания. Повторите попытку.\n-------------");
            task = newScanner.nextInt();
        }
        //Очистка буфера сканера
        newScanner.nextLine();
        if (task == 1) {
            System.out.println("Вы выбрали задание 1.");
        } else if (task == 2) {
            System.out.println("Вы выбрали задание 2.");
        } else if (task == 3) {
            System.out.println("Вы выбрали задание 3.");
        } else if (task == 4) {
            System.out.println("Вы выбрали задание 4.");
        } else if (task == 5) {
            System.out.println("Вы выбрали задание 5.");
        }
        boolean isInputDataRandom = false;
        //Интерфейс для выбора способа задания данных
        if (!(task == 1)) {
            System.out.println("Для выполнения данного задания потребуются конкретные значения." +
                    "\nВы бы хотели задать их самостоятельно? (Ответ в формате Да/Нет)");
            String answer = newScanner.nextLine();
            while (!(answer.equals("Да"))  && !(answer.equals("Нет"))) {
                System.out.println("Ошибка! Вы ввели ответ в некорректном формате. Повторите попытку.\n-------------");
                answer = newScanner.nextLine();
            }
            if (answer.equals("Да")) {
                System.out.println("Ответ \"Да\" принят.\nВы сами вводите данные.");
            } else {
                isInputDataRandom = true;
                System.out.println("Ответ \"Нет\" принят.\nДанные выбираются случайно, в диапазоне от -100 до 100.");
            }
        }
        //Вызов метода задания и отправка случайных или заданных пользователем значений
        int [] inputData;
        switch (task) {
            case 1:
                greetings();
                break;
            case 2:
                if (isInputDataRandom) {
                    inputData = setRandomData(2);
                    System.out.println("Значения переменных:\na = " + inputData[0] + "\nb = " + inputData[1] +
                            "\nc = " + inputData[2]);
                } else {
                    inputData = new int[3];
                    System.out.println("Введите значение переменной a:");
                    inputData[0] = newScanner.nextInt();
                    System.out.println("Введите значение переменной b:");
                    inputData[1] = newScanner.nextInt();
                    System.out.println("Введите значение переменной c:");
                    inputData[2] = newScanner.nextInt();
                }
                checkSign(inputData[0], inputData[1], inputData[2]);
                break;
            case 3:
                if (isInputDataRandom) {
                    inputData = setRandomData(3);
                    System.out.println("В метод передаётся " + inputData[0]);
                } else {
                    inputData = new int[1];
                    System.out.println("Введите значение:");
                    inputData[0] = newScanner.nextInt();
                }
                selectColor(inputData[0]);
                break;
            case 4:
                if (isInputDataRandom) {
                    inputData = setRandomData(4);
                    System.out.println("Значения переменных:\na = " + inputData[0] + "\nb = " + inputData[1]);
                } else {
                    inputData = new int[2];
                    System.out.println("Введите значение переменной a:");
                    inputData[0] = newScanner.nextInt();
                    System.out.println("Введите значение переменной b:");
                    inputData[1] = newScanner.nextInt();
                }
                compareNumbers(inputData[0], inputData[1]);
                break;
            case 5:
                if (isInputDataRandom) {
                    inputData = setRandomData(5);
                    System.out.println("Начальное значение:\n" + inputData[0] + "\nДельта:\n" + inputData[1]);
                } else {
                    inputData = new int[2];
                    System.out.println("Введите начальное значение:");
                    inputData[0] = newScanner.nextInt();
                    System.out.println("Введите значение дельты:");
                    inputData[1] = newScanner.nextInt();
                    //Очистка буфера сканера
                    newScanner.nextLine();
                }

                System.out.println("Нужно добавить дельту или отнять её? (Да - добавить/Нет - отнять)");
                String answer = newScanner.nextLine();
                while (!(answer.equals("Да"))  && !(answer.equals("Нет"))) {
                    System.out.println("Ошибка! Вы ввели ответ в некорректном формате. Повторите попытку.\n-------------");
                    answer = newScanner.nextLine();
                }
                boolean increment = false;
                if (answer.equals("Да")) {
                    System.out.println("Дельта будет прибавляться.");
                    increment = true;
                } else {
                    System.out.println("Дельта будет отниматься.");
                    increment = false;
                }
                addOrSubtractAndPrint(inputData[0], inputData[1], increment);
                break;
        }

    }

    //Метод для генерации случайных чисел
    public static int generateInt(int min, int max) {
        return min + (int) (Math.random() * (max -  min));
    }

    //Метод для задания случайных значений от пользователя
    public static int[] setRandomData(int numberOfTask) {
        int[] outputData = new int[2];
        switch (numberOfTask) {
            case 2:
                outputData = new int[3];
                break;
            case 3:
                outputData = new int[1];
                break;
            case 4:
            case 5:
                outputData = new int[2];
                break;
        }
        for (int i = 0; i < outputData.length; i++) {
            outputData[i] = generateInt(-100, 100);
        }
        return outputData;
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
    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //Метод для выполнения задания (5)
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println("Начальное значение: " + initValue + "\nДельта: " + delta + "\nРезультат: " + (initValue + delta));
        } else {
            System.out.println("Начальное значение: " + initValue + "\nДельта: " + delta + "\nРезультат: " + (initValue - delta));
        }
    }
}
