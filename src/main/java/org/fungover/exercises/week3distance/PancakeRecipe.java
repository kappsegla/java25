package org.fungover.exercises.week3distance;

public class PancakeRecipe {
    //Hur mycket vi har hemma:
    private int flour;
    private int milk;
    private int egg;
    private int salt;
    private int butter;

    //Det som behövs för 1 pankaka
    private static final int FLOUR_PER_BATCH = 1000; //g
    private static final int MILK_PER_BATCH = 2; //dl
    private static final int EGG_PER_BATCH = 2; //st
    private static final int SALT_PER_BATCH = 5; //g
    private static final int BUTTER_PER_BATCH = 50; //g

    public PancakeRecipe(int flour, int milk, int egg, int salt, int butter) {
        this.flour = flour;
        this.milk = milk;
        this.egg = egg;
        this.salt = salt;
        this.butter = butter;
    }

    public boolean canMakePancakes() {
        return flour >= FLOUR_PER_BATCH &&
                milk >= MILK_PER_BATCH &&
                egg >= EGG_PER_BATCH &&
                salt >= SALT_PER_BATCH &&
                butter >= BUTTER_PER_BATCH;
    }

    public void makePancakes() {
        if (canMakePancakes()) {
            flour -= FLOUR_PER_BATCH;
            milk -= MILK_PER_BATCH;
            egg -= EGG_PER_BATCH;
            salt -= SALT_PER_BATCH;
            butter -= BUTTER_PER_BATCH;

            System.out.println("Vi tillverkar pannkakor");
            makePancakes();
        } else {
            System.out.println("Inte tillräckligt ingredienser.");
        }
    }

    static void main() {
        PancakeRecipe recipe = new PancakeRecipe(2000, 23, 6, 10, 200);
        recipe.makePancakes();
    }


}