package Lesson_4.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        List<Integer> listInt = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Double> listDouble = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5));
        List<String> listString = new ArrayList<>(Arrays.asList("1.23", "2.34", "3.45", "4.56", "5.67"));

        System.out.println("Сумма = " + calculator.sum(listInt));
        System.out.println("Деление = " + calculator.div(listInt));
        System.out.println("Умножение = " + calculator.multiply(listInt));

        System.out.println("Сумма = " + calculator.sum(listDouble));
        System.out.println("Деление = " + calculator.div(listDouble));
        System.out.println("Умножение = " + calculator.multiply(listDouble));

        System.out.println("Бинарное представление = " + calculator.binaryTranslation(listInt));
        System.out.println("Бинарное представление = " + calculator.binaryTranslation(listDouble));
        System.out.println("Бинарное представление = " + calculator.binaryTranslation(listString));
    }
}