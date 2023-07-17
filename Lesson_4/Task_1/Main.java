package Lesson_4.Task_1;

public class Main {
    public static void main(String[] args) {
        SimpleBox intBox1 = new SimpleBox(10);
        SimpleBox intBox2 = new SimpleBox(20);
        int sum = (Integer) intBox1.getObj() + (Integer) intBox2.getObj();
        System.out.println("sum = " + sum);
        intBox2.setObj("10");
        if (intBox1.getObj() instanceof Integer && intBox2.getObj() instanceof Integer) {
            int sum2 = (Integer) intBox1.getObj() + (Integer) intBox2.getObj();
            System.out.println("sum2 = " + sum2);
        }
        GenBox<Integer> gen1 = new GenBox(15);
        GenBox<Integer> gen2 = new GenBox(10);
        int sum3 = gen1.getObj() + gen2.getObj();
        System.out.println("sum3 = " + sum3);
    }
}