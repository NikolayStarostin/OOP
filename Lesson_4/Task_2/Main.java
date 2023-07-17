package Lesson_4.Task_2;

public class Main {
    public static void main(String[] args) {
        BoxWithNumber<Integer> box1 = new BoxWithNumber(1, 2, 3, 4, 5, 9, 10, 15);
        System.out.println("среднее значение = " + box1.average());

        BoxWithNumber<Double> box2 = new BoxWithNumber(1.1, 2.0, 3.0, 4.0, 5.0, 9.0, 10.0, 15.0);
        System.out.println("среднее значение = " + box2.average());

        System.out.println("среднее значение сравнение = " + box1.compareAverage(box2));
    }
}