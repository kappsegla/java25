package org.fungover.exercises.week3;

public class Animal {
    private String species;
    private String name;
    private int numberOfLegs;

    public Animal(String species, String name, int numberOfLegs) {
        this.species = species;
        this.name = name;
        this.numberOfLegs = numberOfLegs;
    }

    public void printInfo() {
        System.out.println("Species: " + species + ", \nName: " + name + ", \nNumber of legs: " + numberOfLegs);
    }

    static void main() {
        Animal animal1 = new Animal("Apa", "Jörgen", 2);
        Animal animal2 = new Animal("Tvestjärt", "Bosse", 6);
        animal1.printInfo();
        animal2.printInfo();
    }
}
