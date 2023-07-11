package Lesson_2.Seminar.Task_2;

public class Dog extends Animal {
    private static int cnt;


    public Dog() {
    }

    public Dog(String name, String type) {
        super(name, "Пес");
        cnt++;
    }


    public static int getCnt() {
        return cnt;
    }
}