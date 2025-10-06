package org.fungover.oop4;

public interface Pet {
    boolean isCute();
}

interface Feed {
    void feedMeNow();
}

class Cat implements Pet, Feed {

    @Override
    public boolean isCute() {
        return true;
    }

    @Override
    public void feedMeNow() {
        System.out.println("Nom nom nom");
    }

    static void main() {
        Cat cat = new Cat();
        cat.feedMeNow();
        System.out.println(cat.isCute());

        Pet pet = new Cat();
        System.out.println(pet.isCute());

        Feed feed = new Cat();
        feed.feedMeNow();
    }
}