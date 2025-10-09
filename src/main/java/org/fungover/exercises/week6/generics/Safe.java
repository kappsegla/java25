package org.fungover.exercises.week6.generics;

public class Safe<T> {
    private T object;

    public void store(T object) {
        if (object == null)
            throw new IllegalArgumentException("This safe won't store empty things");
        if (this.object != null)
            throw new IllegalStateException("Safe is full. Can't store more stuff");
        this.object = object;
    }

    public T retrieve() {
        if (object == null)
            throw new IllegalStateException("Safe is empty. Nothing to retrieve");
        T temp = object;
        object = null;
        return temp;
    }

    static void main() {
        Safe<String> safe = new Safe<>();
        safe.store("Secret Stuff");
        safe.store(null);
        var stuff = safe.retrieve();
        System.out.println(stuff);
    }
}
