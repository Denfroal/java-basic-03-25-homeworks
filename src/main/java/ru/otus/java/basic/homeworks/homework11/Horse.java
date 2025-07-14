package ru.otus.java.basic.homeworks.homework11;

public class Horse extends Animal {
    private int swimmingSpeed;
    public Horse(String name, int runningSpeed, int swimmingSpeed, int indurance) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.indurance = indurance;
    }
    public int swim(int distance) {
        int time;
        induranceCosts = 4;
        if (distance > 0) {
            indurance -= induranceCosts;
            if (indurance >= 0) {
                time = distance / swimmingSpeed;
                System.out.println("Лошадь " + this.name + " проплыла расстояние " + distance + " метров");
                return time;
            } else {
                System.out.println("У лошади" + this.name + " появилось состояние усталости");
                return -1;
            }
        }   else {
            System.out.println("Введено некорректное значение расстояния");
            return 0;
        }
    }
}
