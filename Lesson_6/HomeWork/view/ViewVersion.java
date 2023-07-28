package Lesson_6.HomeWork.view;

import Lesson_6.HomeWork.controller.Controller;
import Lesson_6.HomeWork.controller.ControllerVersion;
import Lesson_6.HomeWork.controller.ControllerTranslation;

import java.util.List;

/**
 * Single Responsibility Principle («Принцип единой ответственности», SRP).
 * Класс отвечает за вывод в консоль результатов.
 * Open-Closed Principle («Принцип открытости-закрытости», OCP).
 * Класс закрыт для изменений, но может быть расширен.
 */

public class ViewVersion extends View {

    protected ControllerVersion controllerNewVersion;
    protected ControllerTranslation controllerTranslation;

    public ViewVersion(Controller controller, ControllerVersion controllerNewVersion,
            ControllerTranslation controllerTranslation, List<Double> doubleList,
            List<Integer> integerList, List<Number> numberList, List<Float> floatList,
            List<String> stringList) {
        super(controller, doubleList, integerList, numberList, floatList, stringList);
        this.controllerNewVersion = controllerNewVersion;
        this.controllerTranslation = controllerTranslation;
    }

    public void initNewVersion() {
        /**
         * Liskov Substitution Principle («Принцип подстановки Барбары Лисков», LSP).
         */
        System.out.println("calculator.sum(integerList) = " + controllerTranslation.sum(integerList));
        System.out.println("calculator.multiplication(numberList) = " + controllerNewVersion.multiplication(numberList));
        System.out.println("calculator.multiplication(numberList) = " + controllerNewVersion.multiplication(numberList));
        System.out.println("calculator.division(numberList) = " + controllerNewVersion.division(numberList));
        System.out.println("calculator.translation(integerList) = " + controllerTranslation.translation(integerList));
        System.out.println("calculator.translation(doubleList) = " + controllerTranslation.translation(doubleList));
        System.out.println("calculator.translation(floatList) = " + controllerTranslation.translation(floatList));
        System.out.println("calculator.translation(stringList) = " + controllerTranslation.translation(stringList));
    }

}