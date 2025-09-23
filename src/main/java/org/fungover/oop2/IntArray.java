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
        if (size == elements.length) {
            int[] temp = new int[size + 1];
            //Copy from elements to temp
            for (int i = 0; i < size; i++) {
                temp[i] = elements[i];
            }
            elements = temp;
        }
        elements[size++] = value;
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


    }

}
