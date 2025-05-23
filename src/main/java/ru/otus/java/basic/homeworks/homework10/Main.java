package ru.otus.java.basic.homeworks.homework10;

public class Main {
    public static void main(String[] args) {
        User [] arrayUsers = {
                new User ("Frolov", "Denis", "Alexandrovich", 1997, "DFtest@yandex.ru"),
                new User ("Petrov", "Danil", "Semenovich", 1993, "Petrovtest@yandex.ru"),
                new User ("Ivanov", "Saveliy", "Ivanovich", 1958, "Ivanovtest@yandex.ru"),
                new User ("Sidorov", "Roman", "Petrovich", 1975, "Sidorovtest@yandex.ru"),
                new User ("Prucev", "Konstantin", "Ivanovich", 1972, "Prucevtest@yandex.ru"),
                new User ("Lunev", "Georgiy", "Andreevich", 2007, "Lunevtest@yandex.ru"),
                new User ("Arshavin", "Oleg", "Denisovich", 2001, "Arshavintest@yandex.ru"),
                new User ("Ziryanov", "Petr", "Semenovich", 1993, "Ziryanovtest@yandex.ru"),
                new User ("Yakupov", "Semen", "Romanovich", 1986, "Yakupovtest@yandex.ru"),
                new User ("Lunin", "Igor", "Petrovich", 2000, "Lunintest@yandex.ru")
        };

        for (int i = 0; i < arrayUsers.length; i++) {
            if (2025 - arrayUsers[i].getYear() > 40) {
                arrayUsers[i].printUserInfo();
                System.out.println();
            }
        }

        Box testBox = new Box (3, "красный");
        testBox.printBoxInfo();
        testBox.open();
        testBox.repaint("синий");
        testBox.removeItem();
        testBox.putItem("Мяч");
    }
}
