package Lesson_2.Seminar.Task_1;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog("Hatiko", "Black", 3);
        dog.animalInfo();
        Animal cat3 = new Cat("Tom", "White", 21);
        ((Cat) cat3).klubok();
        Animal[] catAndDog = {
                new Cat("Cat", "Black", 11),
                new Dog("Dog", "Scalp", 12)
        };
        for (Animal o : catAndDog) {
            o.voice();
        }
    }
}