package Lesson_2.Seminar.Task_2;

public class Tiger extends Cat {
    private static int cnt;

    public Tiger() {
    }

    public Tiger(String name, String type) {
        super(name, type);
        cnt++;
    }

    public static int getCnt() {
        return cnt;
    }
}