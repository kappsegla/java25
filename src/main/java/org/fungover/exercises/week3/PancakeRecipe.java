package org.fungover.exercises.week3;

public class PancakeRecipe {
    public static final double FLOUR = 2.5;
    public static final double MILK = 6;
    public static final int EGG = 3;
    public static final double SALT = 0.5;
    public static final double BUTTER = 1;

    private double flour;
    private double milk;
    private int egg;
    private double salt;
    private double butter;

    public PancakeRecipe(double flour, double milk, int egg, double salt, double butter) {
        this.flour = flour;
        this.milk = milk;
        this.egg = egg;
        this.salt = salt;
        this.butter = butter;
    }

    public boolean canMakePancakes() {
        return FLOUR <= flour && MILK <= milk && EGG <= egg && SALT <= salt && BUTTER <= butter;
    }

    public void makePancakes() {
        while (canMakePancakes()) {
            this.flour -= FLOUR;
            this.milk -= MILK;
            this.egg -= EGG;
            this.salt -= SALT;
            this.butter -= BUTTER;
            System.out.println("Making pancake!");
        }
        System.out.println("No more Ingredients. :c");
    }


    static void main() {
        var pancake = new PancakeRecipe(20, 15, 10, 10, 3);
        System.out.println(pancake.canMakePancakes());
        pancake.makePancakes();
    }
}
