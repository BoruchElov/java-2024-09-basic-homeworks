package ru.otus.java.basic.homeworks;

import ru.otus.java.basic.homeworks.utilities.Box;
import ru.otus.java.basic.homeworks.utilities.User;

import java.util.Random;

public class Homework4 {

    static String[] names = new String[]{"Сергей", "Карина", "Виталина", "Ицхак", "Ильдар"};
    static String[] surnames = new String[]{"Иванов/-а", "Магомедов/-а", "Коган", "Керимбаев/-а", "Светлов/-а"};
    static String[] fatherNames = new String[]{"Евгеньевич/-вна", "Юсуфович/-на", "Давидович/-вна",
            "Ибрагимович/-вна", "Даниилович/-вна"};
    static int[] yearsOfBirth = new int[]{1963, 2000, 1990, 1974, 1981};
    static String[] emails = new String[]{"cash@gmail.com", "kid@mail.ru", "john@yandex.ru", "paul@yahoo.com",
            "swan@rambler.ru"};

    public static void main(String[] args) {
        User[] users = new User[10];
        for (int i = 0; i < users.length; i++) {
            users[i] = generateRandomUser();
            if (users[i].isUserOlderThan(40)) {
                users[i].printUserInfo();
                System.out.println("-------------");
            }
        }
        Box newBox = new Box(Box.Colors.Brown, Box.Sizes.Medium, true);
        newBox.printInfo();
        System.out.println("-------------");
        newBox.close();
        System.out.println("-------------");
        newBox.putInside("коньки");
        System.out.println("-------------");
        newBox.open();
        System.out.println("-------------");
        newBox.putInside("коньки");
        System.out.println("-------------");
        newBox.setColor(Box.Colors.Blue);
        System.out.println("-------------");
        newBox.printInfo();
        System.out.println("-------------");
        newBox.close();
        System.out.println("-------------");
        newBox.printInfo();
        System.out.println("-------------");
        newBox.draw();
        System.out.println("-------------");
        newBox.printInfo();
        System.out.println("-------------");
        newBox.open();
        System.out.println("-------------");
        newBox.draw();
        System.out.println("-------------");
        newBox.printInfo();
    }

    /**
     * <p>Метод для создания экземпляра класса <code>User</code> со случайными значениями полей, определёнными
     * из заданного массива возможных данных</p>
     */
    public static User generateRandomUser() {
        Random random = new Random();
        User user = new User(names[random.nextInt(5)], surnames[random.nextInt(5)],
                fatherNames[random.nextInt(5)], yearsOfBirth[random.nextInt(5)],
                emails[random.nextInt(5)]);
        return user;
    }
}
