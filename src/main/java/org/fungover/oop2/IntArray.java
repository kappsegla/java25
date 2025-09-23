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
        insert(0, value);
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
        checkAndIncreaseSizeWhenNeeded();
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = value;
        size++;
    }

    public void replace(int index, int value) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Index " + index + " is invalid for size " + size);
        elements[index] = value;
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    /**
     * Start index must be less than end index.
     * If start index == end index an empty array is returned
     *
     * @param startIndex Start index >=0 inclusive
     * @param endIndex   End index exclusive
     * @return
     */
    public int[] subArray(int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex < 0 ||
                startIndex > size - 1 || endIndex > size
                || startIndex > endIndex) {
            throw new IllegalArgumentException("Invalid start or end index");
        }
        if (startIndex == endIndex)
            return new int[0];
        return Arrays.copyOfRange(elements, startIndex, endIndex);
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
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.remove(9);
        var result = array.subArray(5, 7);
        System.out.println("The array after subArray: " + result.toString());

//        array.addFirst(12);
//        System.out.println("The array after add: " + array.toString());
//        array.insert(2, 20);
//        System.out.println("The array after insert: " + array.toString());
//        array.remove(1);
//        System.out.println("The array after remove: " + array.toString());

    }

}
