package ru.otus.java.basic.homeworks.homework16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(getArray(-5, 6));
        List <Integer> elements = new ArrayList<>(Arrays.asList(1,3,5,7,8,12));
        Employee employee1 = new Employee("Denis", 27);
        Employee employee2 = new Employee("Maxim", 33);
        Employee employee3 = new Employee("Ilya", 25);
        List <Employee> employees = new ArrayList<>(Arrays.asList(employee1,employee2, employee3));
        System.out.println(getYoungEmployee(employees));
        System.out.println(getNameEmployee(employees));
        System.out.println(getNameEmployeeByAge(employees, 30));
        System.out.println(checkAverageAgeByArgument(employees, 40));
        System.out.println(getSumElements(elements));
        increaseElements(5, elements);
        rewriteElements(3, elements);
        System.out.println(elements);
    }
    public static List<Integer> getArray(int min, int max) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int arrayCount = 0;
        for (int i = min; i <= max; i++) {
            arrayList.add(arrayCount,i);
            arrayCount ++;
        }
        return arrayList;
    }
    public static int getSumElements(List <Integer> arrayList) {
        int sumElements = 0;
        for (int element: arrayList) {
            if (element > 5) {
                sumElements += element;
            }
        }
        return sumElements;
    }
    public static void rewriteElements(int number, List <Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, number);
        }
    }
    public static void increaseElements(int number, List <Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, arrayList.get(i) + number);
        }
    }
    public static List<String> getNameEmployee(List<Employee> employeeArray) {
        List <String> nameEmployeeArray = new ArrayList<>();
        for (int i = 0; i < employeeArray.size(); i++) {
            nameEmployeeArray.add(employeeArray.get(i).getName());
        }
        return nameEmployeeArray;
    }
    public static List<String> getNameEmployeeByAge(List<Employee> employeeArray, int minAge) {
        List <String> nameEmployeeArray = new ArrayList<>();
        for (int i = 0; i < employeeArray.size(); i++) {
            if (employeeArray.get(i).getAge() >= minAge) {
                nameEmployeeArray.add(employeeArray.get(i).getName());
            }
        }
        return nameEmployeeArray;
    }
    public static boolean checkAverageAgeByArgument(List<Employee> employeeArray, int minAverageAge) {
        int sumAge = 0;
        for (int i = 0; i < employeeArray.size(); i++) {
            sumAge += employeeArray.get(i).getAge();
            }
        int averageAge = sumAge / employeeArray.size();
        System.out.println("Средний возраст сотрудников - " + averageAge + " лет");
        if (averageAge > minAverageAge) {
            System.out.println("Средний возраст сотрудников превышает " + minAverageAge + " лет");
            return true;
        } else {
            System.out.println("Средний возраст сотрудников не превышает " + minAverageAge + " лет");
            return false;
        }
    }
    public static Employee getYoungEmployee(List<Employee> employeeArray) {
        Employee youngEmployee = new Employee();
        int minAge = employeeArray.get(0).getAge();
        for (Employee employee:
             employeeArray) {
            if (employee.getAge() < minAge) {
                youngEmployee = employee;
            }
        }
        return youngEmployee;
    }
}
