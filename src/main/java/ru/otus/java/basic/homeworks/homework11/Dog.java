package ru.otus.java.basic.homeworks.homework11;

public class Dog extends Animal {
    private double swimmingSpeed;

    public Dog(String name, int runningSpeed, int swimmingSpeed, int indurance) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.indurance = indurance;
    }

    public double swim(int distance) {
        double time;
        induranceCosts = 2;
        if (distance > 0) {
            indurance -= induranceCosts;
            if (indurance >= 0) {
                time = distance / swimmingSpeed;
                System.out.println("Собака " + this.name + " проплыла расстояние " + distance + " метров");
                return time;
            } else {
                System.out.println("У собаки " + this.name + " появилось состояние усталости");
                return -1;
            }
        }   else {
            System.out.println("Введено некорректное значение расстояния");
            return 0;
        }
    }
}
