package org.fungover.oop4;

public class LinkedList {

    Node first = null;
    Node last = null;

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
            //Alternative solution without keepin a last reference
            //        Node temp = first;
            //        while( temp.next != null)
            //            temp = temp.next;
            //        //Temp pekar nu på sista noden
        }
    }

    public String get(int index) {
        return "";
    }

    static void main() {
        LinkedList list = new LinkedList();
        list.add("Number 1");
        list.add("Number 2");
        list.add("Number 3");
    }
}

class Node {
    String value;
    Node next;
}