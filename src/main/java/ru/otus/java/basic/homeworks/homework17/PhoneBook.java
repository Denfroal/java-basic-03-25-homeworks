package ru.otus.java.basic.homeworks.homework17;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> humans;

    public PhoneBook(Map<String, List<String>> humans) {
        this.humans = humans;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "humans=" + humans +
                '}';
    }

    public void add(String fio, ArrayList<String> telephones) {
        humans.put(fio, telephones);
    }

    public void find(String fio) {
        System.out.println("По имени " + fio + " найдены телефоны: " + humans.get(fio));
    }

    public boolean containsPhoneNumber(String telephoneNumber) {
        for (String key : humans.keySet()) {
            List<String> humanElements = humans.get(key);
            if (humanElements.contains(telephoneNumber)) {
                System.out.println("Найден номер телефона: " + telephoneNumber);
                return true;
            }
        }
        System.out.println("Номер телефона " + telephoneNumber + " в справочнике отсутствует");
        return false;
    }
}
