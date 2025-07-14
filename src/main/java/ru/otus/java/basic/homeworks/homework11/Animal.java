package ru.otus.java.basic.homeworks.homework11;

public class Animal {
    protected String name;
    protected double runningSpeed;
    protected int endurance;


    protected double run(double distance) {
        if (distance <= 0) {
            System.out.println("Введено некорректное значение расстояния");
            return 0;
        }
        endurance -= distance;
        if (endurance < 0) {
            System.out.println("У животного " + this.name + " появилось состояние усталости");
            return -1;
        }
        double time = distance / runningSpeed;
        System.out.println("Животным " + this.name + " пройдено расстояние " + distance + " метров");
        return time;

    }
    protected void info() {
        System.out.println("Выносливость " + this.name + " равна " + endurance + " единиц");
    }
}
