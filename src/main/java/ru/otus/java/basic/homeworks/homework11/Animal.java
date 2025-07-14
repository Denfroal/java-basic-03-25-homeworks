package ru.otus.java.basic.homeworks.homework11;

public class Animal {
    protected String name;
    protected double runningSpeed;
    protected int indurance;
    protected double induranceCosts;

    protected double run(double distance) {
        double time;
        induranceCosts = distance;
        if (distance > 0) {
            indurance -= induranceCosts;
            if (indurance >= 0) {
                time = distance / runningSpeed;
                System.out.println("Животным " + this.name + " пройдено расстояние " + distance + " метров");
                return time;
            } else {
                System.out.println("У животного " + this.name + " появилось состояние усталости");
                return -1;
            }
        }   else {
              System.out.println("Введено некорректное значение расстояния");
              return 0;
        }
    }
    protected void info() {
        System.out.println("Выносливость " + this.name + " равна " + indurance + " единиц");
    }
}
