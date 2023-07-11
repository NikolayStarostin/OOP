package Lesson_2.Seminar.Task_3;

public class Car implements Transport{
    @Override
    public void start() {
        System.out.println("Машина едет");
    }

    @Override
    public void stop() {
        System.out.println("Машина стоит");

    }
}