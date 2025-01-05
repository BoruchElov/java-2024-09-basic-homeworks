package ru.otus.java.basic.homeworks;

import java.util.Arrays;

public class Homework3 {

    public static void main(String[] args) {
        int[][] dataArray = generate2DArray(-10,10,3,3);
        System.out.println("Сгенерированный массив данных:");
        print2DArray(dataArray);
        System.out.println("Сумма всех положительных элементов массива:");
        System.out.println(sumOfPositiveElements(dataArray));
        printSquare(10);
        setDiagonalsAsZeroes(typeOfDiagonal.Both, dataArray);
        System.out.println("Изменённый массив данных:");
        print2DArray(dataArray);
        System.out.println("Наибольший элемент массива:");
        System.out.println(findMax(dataArray));
        System.out.println("Сумма элементов второй строки:");
        System.out.println(sumOfSecondLine(dataArray));
    }

    /**
     * Метод для печати двумерного массива не в одну строку, а в виде таблицы
     * @param data массив для печати
     */
    public static void print2DArray(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(Arrays.toString(data[i]));
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
     * <p>Метод для генерации двумерного массива заданного размера.</p>
     * <p>Все элементы массива лежат в заданном диапазоне.</p>
     * @param min нижняя граница диапазона
     * @param max верхняя граница диапазона
     * @param rows количество строк в массиве
     * @param columns количество столбцов в массиве
     * @return массив значений <code>int[rows][columns]</code>
     */
    public static int[][] generate2DArray(int min, int max, int rows, int columns) {
        int[][] outputData = new int[rows][columns];
        for (int i = 0; i < outputData.length; i++) {
            for (int j = 0; j < outputData[i].length; j++) {
                outputData[i][j] = generateInt(min, max);
            }
        }
        return outputData;
    }

    /**
     * <p></p>Метод <code>sumOfPositiveElements</code> вычисляет и возвращает сумму всех элементов входного двумерного массива
     * <code>input2DArray</code>, больших 0.</p>
     * <p>Данный метод используется для выполнения задания 1</p>
     * @param input2DArray двумерный массив произвольной формы
     * @return сумму всех элементов двумерного массива <code>input2DArray</code>, больших 0
     */
    public static int sumOfPositiveElements(int[][] input2DArray) {
        int sum = 0;
        for (int i = 0; i < input2DArray.length; i++) {
            for (int j = 0; j < input2DArray[i].length; j++) {
                if (input2DArray[i][j] > 0) {
                    sum += input2DArray[i][j];
                }
            }
        }
        return sum;
    }

    /**
     * <p>Метод <code>printSquare</code> использвется для печати квадрата, на сторонах которого располагаются *.
     * Размер кадрата задаётся пользователем.</p>
     * <p>Данный метод используется для выполнения задания 2.</p>
     * @param size переменная, задающая размер квадрата
     */
    public static void printSquare(int size) {
        //char[][] square = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size -1 || j == 0 || j == size - 1) {
                    System.out.print("*");
                    System.out.print("  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    /**
     * В данном объекте хранятся возможные варианты задания диагонали:
     * <ol>
     *     <li>Main - главная диагональ массива</li>
     *     <li>Secondary - побочная диаональ массива</li>
     *     <li>Both - обе диагонали</li>
     * </ol>
     */
    public static enum typeOfDiagonal{
        Main, Secondary, Both
    }

    /**
     * <p>Метод <code>setDiagonalsAsZeroes</code> предназначен для зануления любой из диагоналей массива по выбору
     * пользователя. Так, возможно выбрать для зануления главную или побочную диагональ или же занулить обе.</p>
     * <p>Данный метод используется для выполнения задания 3</p>
     * @param typeOfDiagonal диагональ для зануления
     * @param input2DArray массив, диагональ которого зануляется
     */
    public static void setDiagonalsAsZeroes(typeOfDiagonal typeOfDiagonal, int[][] input2DArray) {
        switch (typeOfDiagonal) {
            case Main:
                for (int i = 0; i < input2DArray.length; i++) {
                    for (int j = 0; j < input2DArray[i].length; j++) {
                        if (i == j) {input2DArray[i][j] = 0;}
                    }
                }
                break;
                case Secondary:
                    for (int i = 0; i < input2DArray.length; i++) {
                        for (int j = 0; j < input2DArray[i].length; j++) {
                            if (j == input2DArray[i].length - i - 1) {input2DArray[i][j] = 0;}
                        }
                    }
                    break;
                    case Both:
                        for (int i = 0; i < input2DArray.length; i++) {
                            for (int j = 0; j < input2DArray[i].length; j++) {
                                if (i == j || j == input2DArray[i].length - i - 1) {
                                    input2DArray[i][j] = 0;
                                }
                            }
                        }
                        break;
        }
    }

    /**
     * <p>Метод <code>findMax</code> принимает двумерный массив и возвращает значение наибольшего из его элементов.</p>
     * <p>Данный метод используется для выполнения задания 4.</p>
     * @param input2DArray входной двумерный массив данных
     * @return наибольший элемент массива <code>input2DArray</code>
     */
    public static int findMax(int[][] input2DArray) {
        int max = input2DArray[0][0];
        for (int i = 0; i < input2DArray.length; i++) {
            for (int j = 0; j < input2DArray[i].length; j++) {
                if (input2DArray[i][j] > max) {
                    max = input2DArray[i][j];
                }
            }
        }
        return max;
    }

    /**
     * Метод <code>sumOfSecondLine</code> рассчитывает сумму элементов второй строки входного двумерного массива.
     * @param input2DArray входной двумерный массив
     * @return сумму элементов второй строки, если второй строки не существует, возвращает -1
     */
    public static int sumOfSecondLine(int[][] input2DArray) {
        if (input2DArray.length < 2) {
            return -1;
        } else {
            int sum = 0;
            for (int i = 0; i < input2DArray[1].length; i++) {
                sum += input2DArray[1][i];
            }
            return sum;
        }
    }
}
