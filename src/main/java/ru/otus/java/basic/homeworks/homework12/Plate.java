package ru.otus.java.basic.homeworks.homework12;

public class Plate {
    private int maxFoodAmount;
    private int currentFoodAmount;

    public int getMaxFoodAmount() {
        return maxFoodAmount;
    }

    public void setMaxFoodAmount(int maxFoodAmount) {
        this.maxFoodAmount = maxFoodAmount;
    }

    public int getCurrentFoodAmount() {
        return currentFoodAmount;
    }

    public void setCurrentFoodAmount(int currentFoodAmount) {
        this.currentFoodAmount = currentFoodAmount;
    }

    public Plate(int maxFoodAmount) {
        this.maxFoodAmount = maxFoodAmount;
        this.currentFoodAmount = maxFoodAmount;
    }

    public void addFood(int foodCount) {
        currentFoodAmount += foodCount;
        if (currentFoodAmount > maxFoodAmount) {
            System.out.println("Тарелка переполнена. Необходимо ввести корректное количество еды");
            currentFoodAmount -= foodCount;
        } else {
            System.out.println("В тарелку добавлено " + foodCount + " количества еды");
        }
    }

    public boolean reduceFood (int foodCount) {
        currentFoodAmount -= foodCount;
        if (currentFoodAmount >= 0) {
            return true;
        } else {
            currentFoodAmount += foodCount;
            return false;
        }
    }
}
