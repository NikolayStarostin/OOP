package Lesson_6.HomeWork.controller;

import Lesson_6.HomeWork.model.Calculator;

import java.util.List;

/**
 * Single Responsibility Principle («Принцип единой ответственности»,
 * SRP).Отвечает за умножение и деление элементов.
 * Расширяет класс Controller.
 * Interface Segregation Principle («Принцип разделения интерфейса», ISP).
 */

public class ControllerVersion extends Controller {
    public ControllerVersion(Calculator calculator) {
        super(calculator);
    }

    public double multiplication(List<? extends Number> numbers) {
        return calculator.multiplication(numbers);
    }

    public double division(List<? extends Number> numbers) {
        return calculator.division(numbers);
    }
}
