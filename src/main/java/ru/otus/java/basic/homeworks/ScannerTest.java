package ru.otus.java.basic.homeworks;

import java.math.MathContext;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Math.random();
        Random random = new Random();
        int[] numbers = new int[]{-1, 8, -4, 3, -2, -3, 1, 7};
        System.out.println(Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
        System.out.println(scanner.next());
        char[] chars = input.toCharArray();
        System.out.println(Arrays.toString(chars));
        System.out.println(chars[1]);

        int randomNumber = random.nextInt(10);


    }

    public static void bubbleSort(int[] array) {
        int n = array.length; // Длина массива

        // Внешний цикл проходит по массиву n-1 раз
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // Флаг для отслеживания обменов

            // Внутренний цикл для сравнения соседних элементов
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Меняем местами, если текущий элемент больше следующего
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true; // Указываем, что был обмен
                }
            }

            // Если на текущем проходе обменов не было, массив отсортирован
            if (!swapped) {
                break;
            }
        }
    }

    public enum signOfNumber {
        POSITIVE, NEGATIVE
    }

    public static int generateRandomNumber(signOfNumber sign, int limit) {
        Random randomNuber = new Random();
        return switch (sign) {
            case POSITIVE -> randomNuber.nextInt(limit);
            case NEGATIVE -> -randomNuber.nextInt(-limit);
        };
    }
}

