package ru.otus.java.basic.homeworks.homework10;

public class User {
    public String surname;
    public String name;
    public String patronymic;
    public int year;
    public String email;

    public User(String surname, String name, String patronymic, int year, String email) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.year = year;
        this.email = email;
    }

    public void printUserInfo() {
        System.out.println("ФИО: " + surname + " " + name + " " + patronymic);
        System.out.println("Год рождения: " + year);
        System.out.println("email: " + email);
    }
}
