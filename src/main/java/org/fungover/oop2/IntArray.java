package org.fungover.oop2;


import java.util.Arrays;

public class IntArray {
    private int[] elements = new int[10];
    private int size;

    /**
     * Add value to the end
     *
     * @param value
     */
    //Alt names: append, addLast, insertLast, putLast
    public void add(int value) {
        checkAndIncreaseSizeWhenNeeded();
        elements[size++] = value;
    }

    public void addFirst(int value) {
        checkAndIncreaseSizeWhenNeeded();
        for (int i = size; i > 0; i--) {
            elements[i] = elements[i - 1];
        }
        elements[0] = value;
        size++;
    }

    public int getValue(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Index " + index + " is invalid for size " + size);
        return elements[index];
    }

    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (getValue(i) == value)
                return i;
        }
        return -1;
    }

    public void insert(int index, int value) {

    }

    public void remove(int index) {


    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size));
    }

    private void checkAndIncreaseSizeWhenNeeded() {
        if (size == elements.length) {
            int[] temp = new int[size + 1];
            //Copy from elements to temp
            System.arraycopy(elements, 0, temp, 0, size);
            elements = temp;
        }
    }

    static void main() {
        IntArray array = new IntArray();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.addFirst(12);
        System.out.println("The array after add: " + array.toString());
        array.insert(2, 20);
        System.out.println("The array after insert: " + array.toString());
        array.remove(1);
        System.out.println("The array after renive: " + array.toString());

    }

}
