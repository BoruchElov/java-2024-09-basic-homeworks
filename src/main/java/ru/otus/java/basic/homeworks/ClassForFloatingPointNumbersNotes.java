package ru.otus.java.basic.homeworks;

public class ClassForFloatingPointNumbersNotes {

    public static void main(String[] args) {
        /*int sum = 0;
        int powerOfTwo = 1;
        byte limit = 23;
        for (byte i = 0; i < limit; i++) {
            sum += powerOfTwo;
            powerOfTwo *= 2;
        }

        System.out.println(sum);*/
        int number = 305419896; // Число, которое нужно представить
        String binaryString = Integer.toBinaryString(number); // Получаем двоичное представление
        System.out.println(binaryString);
        // Дополняем строку нулями до 32 бит
        String binary32Bit = String.format("%32s", binaryString).replace(' ', '0');
        int stringLength = binaryString.length();
        System.out.println("Число: " + number);
        System.out.println("Двоичное представление (32 бита): " + binary32Bit);
        System.out.println(stringLength);
    }

}
