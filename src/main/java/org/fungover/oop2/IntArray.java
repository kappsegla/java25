package org.fungover.oop2;


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
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(10);
        array.add(11);
        array.addFirst(12);


    }

}
