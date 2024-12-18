package ru.otus.java.basic.homeworks;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DateTimeUpdater {
    public static void main(String[] args) {
        // Создаем ScheduledExecutorService с одним потоком
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

        // Задаем формат для даты и времени
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Задача для отображения текущей даты и времени
        Runnable displayDateTimeTask = () -> {
            LocalDateTime currentDateTime = LocalDateTime.now();
            System.out.println("Текущая дата и время: " + currentDateTime.format(formatter));
        };

        // Запускаем задачу каждую минуту
        scheduler.scheduleAtFixedRate(displayDateTimeTask, 0, 1, TimeUnit.SECONDS);

        // Чтение нажатия клавиш с клавиатуры
        System.out.println("Нажмите ПРОБЕЛ для остановки программы.");
        try {
            while (true) {
                // Читаем один символ из System.in
                int input = System.in.read();
                if (input == '\n') {  // Проверка на символ пробела
                    System.out.println("Пробел нажат. Остановка программы...");
                    scheduler.shutdown(); // Завершаем выполнение задач
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

