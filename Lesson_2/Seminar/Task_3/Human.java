package Lesson_2.Seminar.Task_3;

public class Human {
    private Transport lastTransport;

    public void drive(Transport transport) {
        lastTransport = transport;
        transport.start();
    }

    public void stop() {
        if (lastTransport != null) {
            lastTransport.stop();
            lastTransport = null;
        } else {
            System.out.println("Мы уже стоим");
        }
    }

}