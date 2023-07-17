package Lesson_4.Task_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        List<Integer> listInt = new ArrayList<>();
        List<Double> listDouble = new ArrayList<>();
        List<Number> listNum = new ArrayList<>();
        for (int i = 0; i < 101; i++) {
            listInt.add(i);
            listDouble.add(((double) i));
            listNum.add(i);
        }
        System.out.println("Сумма = " + calculator.sum(listInt));
        System.out.println("Сумма = " + calculator.sum(listDouble));
        System.out.println("Сумма = " + calculator.sum(listNum));
    }
}