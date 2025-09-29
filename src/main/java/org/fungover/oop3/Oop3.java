package org.fungover.oop3;

public class Oop3 {

    static void main() {
        Bird bird = new Bird();
        Object bird1 = new Bird();

        Bird bird2 = new Penguin();
        Penguin bird3 = new Penguin();

        bird.eat();
        bird2.eat();  //Bird -> Penguin
        bird3.eat();
        //bird3.swim();
//        if( bird2 instanceof Penguin penguin){
//            penguin.swim();
//        }
//        switch(bird2){
//            case Penguin penguin -> penguin.swim();
//            default -> throw new IllegalStateException("Unexpected value: " + bird2);
//        }
        System.out.println(bird);
        System.out.println(bird2);
        System.out.println(bird3);

        Bird.describe();
        Penguin.describe();
        bird.describe();
        bird2.describe();
        bird3.describe();
    }

    static class Bird {
        public void eat() {
            System.out.println("A generic Bird is eating...");
        }

        @Override
        public String toString() {
            return "Bird";
        }

        public static void describe() {
            System.out.println("Birds poop.");
        }
    }

    static class Penguin extends Bird {

        @Override
        public void eat() {
            System.out.println("Penguin is eating some fish.");
        }

        public void swim() {
            System.out.println("I am swimming...");
        }

        @Override
        public String toString() {
            return "Penguin";
        }

        public static void describe() {
            System.out.println("Penguins can't fly");
        }
    }

}
