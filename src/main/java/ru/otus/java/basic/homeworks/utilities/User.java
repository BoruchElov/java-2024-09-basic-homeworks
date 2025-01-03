package ru.otus.java.basic.homeworks.utilities;

public class User {

    private String name;
    private String surname;
    private String fathersName;
    private int yearOfBirth;
    private String email;

    /**
     * <p>Конструктор класса <code>User</code>. Инициализирует значения полей, ответственных за хранение информации
     * о пользователе.</p>
     * @param name Имя пользователя
     * @param surname Фамилия пользователя
     * @param fathersName Отчество пользователя
     * @param yearOfBirth Год рождения пользователя
     * @param email Адрес электронной почты ползователя
     */
    public User (String name, String surname, String fathersName, int yearOfBirth, String email) {
        this.name = name;
        this.surname = surname;
        this.fathersName = fathersName;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }

    /**
     * <p>Метод для печати информации о пользователе в формате:</p>
     * <p>ФИО: </p>
     * <p>Год рождения: </p>
     * <p>e-mail:</p>
     *
     */
    public void printUserInfo() {
        System.out.println("ФИО: " + surname + " " + name + " " + fathersName);
        System.out.println("Год рождения " + yearOfBirth);
        System.out.println("e-mail: " + email);
    }

    /**
     * Метод для проверки возраста пользователя.
     * @param age возраст для сравнения
     * @return <code>true</code>, если пользователь старше заданного возраста
     */
    public boolean isUserOlderThan(int age) {
        return age < 2025 - yearOfBirth;
    }
}
