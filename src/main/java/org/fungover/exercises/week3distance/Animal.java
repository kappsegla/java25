package org.fungover.exercises.week3distance;

public class Animal {
    public String species;
    public int age;
    public String name;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public void printToConsole() {
        System.out.println("Name: " + name + ", Age: " + age + ", Species: " + species);
    }

    static void main() {
        Animal animal1 = new Animal("Bengt", 7, "Gazelle");
        Animal animal2 = new Animal("Gösta", 2, "Giraffe");
        animal1.printToConsole();
        animal2.printToConsole();
    }

}
