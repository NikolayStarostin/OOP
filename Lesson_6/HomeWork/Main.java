package Lesson_6.HomeWork;

import Lesson_6.HomeWork.controller.Controller;
import Lesson_6.HomeWork.controller.ControllerVersion;
import Lesson_6.HomeWork.controller.ControllerTranslation;
import Lesson_6.HomeWork.model.AddNumbers;
import Lesson_6.HomeWork.model.Calculator;
import Lesson_6.HomeWork.view.View;
import Lesson_6.HomeWork.view.ViewVersion;

import java.util.ArrayList;
import java.util.List;

/**
 * Single Responsibility Principle («Принцип единой ответственности», SRP).
 * Наличие единой ответственности не обязательно означает наличие единого метода.
 * Класс отвечает за инициализацию программы.
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Controller controller = new Controller(calculator);
        ControllerVersion controllerNewVersion = new ControllerVersion(calculator);
        ControllerTranslation controllerTranslation = new ControllerTranslation(calculator);
        List<Integer> integerList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        List<Float> floatList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        AddNumbers addNumbers = new AddNumbers();
        addNumbers.addNumbers(doubleList, integerList, numberList, floatList, stringList);
        View view = new View(controller, doubleList, integerList, numberList, floatList, stringList);
        ViewVersion viewNewVersion = new ViewVersion(controller, controllerNewVersion, controllerTranslation,
                doubleList, integerList, numberList, floatList, stringList);
        view.init();
        viewNewVersion.initNewVersion();
        controllerTranslation.translation();
    }
}