package ru.otus.java.basic.homeworks.homework10;

public class Box {
    private int size;
    private String color;
    private boolean isOpen = false;
    private String item;

    public void open() {
        isOpen = true;
        System.out.println("Коробка открыта");
    }

    public void close() {
        isOpen = false;
        System.out.println("Коробка закрыта");
    }

    public void repaint (String color) {
        this.color = color;
        System.out.println("Коробка перекрашена в " + color + " цвет");
    }

    public Box (int size, String color) {
        this.size = size;
        this.color = color;
    }

    public void printBoxInfo() {
        System.out.println("Коробка размером " + size + " покрашена в " + color + " цвет");
    }

    public void putItem(String item) {
        if (isOpen == true) {
            if (this.item == null) {
                this.item = item;
                System.out.println("В коробку положили предмет " + item);
            }
            else {
                System.out.println("В коробке уже находится предмет " + this.item);
            }
        } else {
            System.out.println("Предмет невозможно положить, так как коробка закрыта");
        }
    }

    public void removeItem() {
        if (isOpen == true) {
            if (item != null) {
                System.out.println("Убираем предмет из коробки " + item);
                item = null;
            }
            else {
                System.out.println("В коробке отсутствует предмет");
            }
        } else {
            System.out.println("Предмет невозможно убрать, так как коробка закрыта");
        }
    }
}
