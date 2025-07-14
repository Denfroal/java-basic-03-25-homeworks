package ru.otus.java.basic.homeworks.homework11;

public class Main {
    public static void main(String[] args) {
       Dog dogRex = new Dog ("Rex", 40, 12, 30);
       dogRex.run(20);
       dogRex.info();
       dogRex.swim(15);
       dogRex.info();
       Cat catBars = new Cat ("Barsik", 25, 15);
       catBars.run(5);
       catBars.info();
       Horse horse = new Horse ("Svoboda", 80, 10, 200);
       horse.swim(15);
       horse.run(100);
       horse.info();
    }
}
