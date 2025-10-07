package org.fungover.oop4;

public class LinkedList {

    Node first = null;
    Node last = null;

    /**
     * Stores value in a new Node that is added to the end of the List
     *
     * @param value
     */
    public void add(String value) {
        //First value added
        if (first == null) {
            first = new Node();
            first.value = value;
            last = first;
        }
        //Other values...
        else {
            Node next = new Node();
            last.next = next;
            last = next;
            last.value = value;
            //Alternative solution without keeping a last reference
            //        Node temp = first;
            //        while( temp.next != null)
            //            temp = temp.next;
            //        //Temp pekar nu på sista noden
        }
    }

    public String get(int index) {
        int counter = 0;
        Node temp = first;
        if (temp == null)
            throw new IndexOutOfBoundsException();
        while (counter < index) {
            if (temp == null)
                throw new IndexOutOfBoundsException();
            temp = temp.next;
            counter++;
        }
        return temp.value;
    }

    static void main() {
        LinkedList list = new LinkedList();
        //list.get(0);  //Fail because empty list
        list.add("Number 1");
        list.add("Number 2");
        list.add("Number 3");
        System.out.println(list.get(1));
        //list.get(4);  //Fail bacause too far
    }
}

class Node {
    String value;
    Node next;
}