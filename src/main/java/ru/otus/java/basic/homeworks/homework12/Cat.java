package ru.otus.java.basic.homeworks.homework12;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eatFood (Plate plate) {
        if (plate.getCurrentFoodAmount() >= appetite) {
            satiety = true;
            System.out.println("Кот хорошо поел");
        }
        else {
            satiety = false;
            System.out.println("Коту не хватило еды");
        }
    }
    public void info() {
        if (satiety) {
            System.out.println("Кот " + name + " сыт");
        } else {
            System.out.println("Кот " + name + " голоден");
        }
    }
}
