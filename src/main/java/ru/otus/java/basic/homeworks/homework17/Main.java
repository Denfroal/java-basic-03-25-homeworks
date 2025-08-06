package ru.otus.java.basic.homeworks.homework17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> humans = new HashMap<String, List<String>>();
        humans.put("Иванов Иван Иванович", new ArrayList<String>(List.of("+79106316515", "+79109908751")));
        humans.put("Сидоров Петр Николаевич", new ArrayList<String>(List.of("+79208651611")));
        PhoneBook phoneBook = new PhoneBook(humans);
        phoneBook.add("Петров Геннадий Константинович", new ArrayList<String>(List.of("+79105059816")));
        System.out.println(phoneBook.toString());
        phoneBook.find("Иванов Иван Иванович");
        phoneBook.containsPhoneNumber("+79106316515");
    }
}
