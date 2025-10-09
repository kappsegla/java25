package org.fungover.exercises.week6.generics;

/**
 * A simple generic stack implemented using a singly linked list.
 */
public class Stack<T> {

    private Node<T> top;
    private int size;

    /**
     * Push ska lägga till ett objekt överst i stacken.
     */
    public void push(T value) {
        top = new Node<>(value, top);
        size++;
    }

    /**
     * Pop ska ta bort och returnera det objekt som ligger överst i stacken.
     * Om stacken är tom kastas IllegalStateException.
     */
    public T pop() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty");
        }
        T value = top.value();
        top = top.next();
        size--;
        return value;
    }

    /**
     * Returns the element on top without removing it, or null if empty.
     */
    public T peek() {
        return top == null ? null : top.value();
    }

    /**
     * Returns true if the stack contains no elements.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns the number of elements in the stack.
     */
    public int size() {
        return size;
    }

    private record Node<T>(T value, Node<T> next) {
    }
}
