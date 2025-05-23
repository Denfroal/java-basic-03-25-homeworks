package ru.otus.java.basic.homeworks.homework10;

public class User {
    private String surname;
    private String name;
    private String patronymic;
    private int year;
    private String email;

    public User(String surname, String name, String patronymic, int year, String email) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.year = year;
        this.email = email;
    }

    public int getYear() {
        return year;
    }

    public void printUserInfo() {
        System.out.println("ФИО: " + surname + " " + name + " " + patronymic);
        System.out.println("Год рождения: " + year);
        System.out.println("email: " + email);
    }
}
