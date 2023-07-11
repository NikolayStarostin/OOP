package Lesson_2.Seminar.Task_2;

public class HomeCat extends Cat {
    private static int cnt;


    public HomeCat() {
    }

    public HomeCat(String name, String type) {
        super(name, type);
        cnt++;
    }


    public static int getCnt() {
        return cnt;
    }
}