package ru.otus.java.basic.homeworks;

import java.util.Arrays;

public class Homework2 {
    /*
    Описание задания:
    1) Реализуйте метод, принимающий в качестве аргументов целое число и строку, и печатающий в консоль строку
    указанное количество раз
    2) Реализуйте метод, принимающий в качестве аргумента целочисленный массив, суммирующий все элементы, значение
    которых больше 5, и печатающий полученную сумму в консоль
    3) Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив, метод должен
    заполниться каждую ячейку массива указанным числом
    4) Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив, увеличивающий
    каждый элемент которого на указанное число
    5) Реализуйте метод, принимающий в качестве аргумента целочисленный массив, и печатающий в консоль сумма элементов
    какой из половин массива больше
     */

    public static void main(String[] args) {
        printLine(10, "Текст для печати");
        System.out.println("-------------");
        //Генерируем массив данных для выполнения заданий
        int[] dataForTasks = generateArray(0,10,10);
        System.out.println("-------------");
        sumIfNumberIsGreaterThanFive(dataForTasks);
        System.out.println("-------------");
        int[] emptyArray = new int[10];
        setElementsEqualToInputNumber(3, emptyArray);
        System.out.println("-------------");
        incrementOfEveryElement(4, emptyArray);
        System.out.println("-------------");
        printValeOfBiggerSideSum(dataForTasks);
        System.out.println("-------------");
    }

    /**
     * Метод для выполнения задания №1. Печатает текст заданное количество раз
     * @param numberOfPrints определяет, сколько раз нужно напечатать текст
     * @param text сам текст
     */
    public static void printLine(int numberOfPrints, String text) {
        System.out.println("Задание №1:");
        for(int i = 0; i < numberOfPrints; i++) {
            System.out.println(text);
        }
    }

    /**
     * <p>Метод для генерации случайного числа в заданном диапазоне.</p>
     * <p>Используется для генерации массива данных.</p>
     *
     * @param min нижняя граница диапазона
     * @param max верхняя граница диапазона
     * @return число типа <code>int</code> в заданном диапазоне
     */

    public static int generateInt(int min, int max) {
        return min + (int) (Math.random() * (max -  min));
    }

    /**
     * <p>Метод для генерации массива заданного размера.</p>
     * <p>Все элементы массива лежат в заданном диапазоне.</p>
     * @param min нижняя граница диапазона
     * @param max верхняя граница диапазона
     * @param size размер массива
     * @return массив значений <code>int[size]</code>
     */
    public static int[] generateArray(int min, int max, int size) {
        int[] outputData = new int[size];
        for (int i = 0; i < outputData.length; i++) {
            outputData[i] = generateInt(min, max);
        }
        System.out.println("Сгенерированный массив данных:");
        System.out.println(Arrays.toString(outputData));
        return outputData;
    }

    /**
     * Метод для выполнения задания №2. Суммирует все элементы массива <code>inputData</code> со значением >5 и печатает их сумму.
     * @param inputData массив данных для проверки
     */

    public static void sumIfNumberIsGreaterThanFive(int[] inputData) {
        System.out.println("Задание №2:");
        int sum = 0;
        for (int i = 0; i < inputData.length; i++) {
            if (inputData[i] > 5) {
                sum += inputData[i];
            }
        }
        System.out.println(sum);
    }

    /**
     * <p>Метод для выполнения задания №3. Принимает массив и заполняет его заданным числом.</p>
     * @param valueOfElement число, которым заполнятся элементы массива
     * @param emptyArray массив для заполнения
     */
    public static void setElementsEqualToInputNumber(int valueOfElement, int[] emptyArray) {
        System.out.println("Задание №3:");
        System.out.println("Исходный массив данных:");
        System.out.println(Arrays.toString(emptyArray));
        for (int i = 0; i < emptyArray.length; i++) {
            emptyArray[i] = valueOfElement;
        }
        System.out.println("Массив после заполнения числом " + valueOfElement);
        System.out.println(Arrays.toString(emptyArray));
    }
    /**
     * <p>Метод для выполнения задания №4. Принимает массив и увеличивает каждый его элемент на заданное число.</p>
     * @param valueOfIncrement число, на которое увеличатся все элементы массива
     * @param inputData массив для изменения
     */
    public static void incrementOfEveryElement(int valueOfIncrement, int[] inputData) {
        System.out.println("Задание №4:");
        System.out.println("Исходный массив данных:");
        System.out.println(Arrays.toString(inputData));
        for (int i = 0; i < inputData.length; i++) {
            inputData[i] += valueOfIncrement;
        }
        System.out.println("Массив после увеличения каждого элемента на " + valueOfIncrement);
        System.out.println(Arrays.toString(inputData));
    }

    /**
     * <p>Метод для выполнения задания №5. Принимает массив данных, рассчитывает суммы первой половины элементов и
     * второй, а затем сравнивает их и печатает, какая из них бюольше</p>
     * @param inputData массив для анализа
     */
    public static void printValeOfBiggerSideSum(int[] inputData) {
        System.out.println("Задание №5:");
        System.out.println("Исходный массив данных:");
        System.out.println(Arrays.toString(inputData));

        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < inputData.length/2; i++) {
            sumLeft += inputData[i];
        }
        for (int i = inputData.length/2; i < inputData.length; i++) {
            sumRight += inputData[i];
        }
        System.out.println("Сумма первых " + inputData.length + " элементов равна:");
        System.out.println(sumLeft);
        System.out.println("Сумма оставшихся " + inputData.length + " элементов равна:");
        System.out.println(sumRight);
        if (sumLeft > sumRight) {
            System.out.println("Сумма элементов первой половины больше");
        } else if (sumLeft < sumRight) {
            System.out.println("Сумма элементов второй половины больше");
        } else {
            System.out.println("Суммы элементов обеих половин равны");
        }
    }

}
