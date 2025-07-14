package ru.otus.java.basic.homeworks.homework11;

public class Horse extends Animal {
    private double swimmingSpeed;
    public Horse(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.endurance = endurance;
    }
    public double swim(int distance) {
        if (distance <= 0) {
            System.out.println("Введено некорректное значение расстояния");
            return 0;
        }
        endurance -= 4 * distance;
        if (endurance < 0) {
            System.out.println("У собаки " + this.name + " появилось состояние усталости");
            return -1;
        }
        double time = distance / swimmingSpeed;
        System.out.println("Собака " + this.name + " проплыла расстояние " + distance + " метров");
        return time;
    }
}

