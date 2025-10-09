package org.fungover.exercises.week6.generics;

/**
 * A stack implemented with a doubly linked list that can print
 * its contents forward and backward.
 */
public class DoublyLinkedStack<T> {

    private DNode<T> head; // top of stack
    private DNode<T> tail; // bottom of stack (to ease backward traversals)
    private int size;

    private static class DNode<T> {
        T value;
        DNode<T> next;
        DNode<T> prev;

        DNode(T value) {
            this.value = value;
        }
    }

    /**
     * Push places a value on the top of the stack.
     */
    public void Push(T value) {
        DNode<T> n = new DNode<>(value);
        n.next = head;
        if (head != null) {
            head.prev = n;
        }
        head = n;
        if (tail == null) {
            tail = n;
        }
        size++;
    }

    /**
     * Pop removes and returns the top value. Throws if empty.
     */
    public T Pop() {
        if (head == null) throw new IllegalStateException("Stack is empty");
        T value = head.value;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            // became empty
            tail = null;
        }
        size--;
        return value;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Prints from top (head) to bottom (tail).
     */
    public void printForward() {
        DNode<T> cur = head;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (cur != null) {
            sb.append(cur.value);
            cur = cur.next;
            if (cur != null) sb.append(", ");
        }
        sb.append("]");
        System.out.println(sb);
    }

    /**
     * Prints from bottom (tail) to top (head).
     */
    public void printBackward() {
        DNode<T> cur = tail;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (cur != null) {
            sb.append(cur.value);
            cur = cur.prev;
            if (cur != null) sb.append(", ");
        }
        sb.append("]");
        System.out.println(sb);
    }
}
