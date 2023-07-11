package Lesson_2.Seminar.Task_3;

public class Skateboard implements Transport {
    @Override
    public void start() {
        System.out.println("Скейт едет");

    }

    @Override
    public void stop() {
        System.out.println("Скейт стоит");

    }
}