package org.fungover.exercises.week3;

import java.util.ArrayList;
import java.util.List;

public class Semaphore {
    static class Resource {
        //method release
        public void release() {
            pool.add(this);
            Semaphore.numberOfInstances--;
        }
    }

    //Max antal objekt
    private static final int MAX_INSTANCES = 3;
    private static int numberOfInstances;

    //Object pool
    private static List<Resource> pool = new ArrayList<>();

    static {
        for (int i = 0; i < MAX_INSTANCES; i++)
            pool.add(new Resource());
    }

    private Semaphore() {
    }

    public static Semaphore.Resource request() {
        if (numberOfInstances < MAX_INSTANCES) {
            numberOfInstances++;
            return pool.removeLast();
        } else
            return null;
    }
}

//public class Semaphore {
//    private static final int MAX_INSTANCES = 5;
//    private static final Semaphore[] POOL = new Semaphore[MAX_INSTANCES];
//    private int position;
//
//    private Semaphore(int position) {
//        this.position = position;
//    }
//
//    public static Semaphore request(){
//        for (int i = 0; i < MAX_INSTANCES; i++)
//            if (POOL[i] == null) {
//                POOL[i] = new Semaphore(i);
//                return POOL[i];
//            }
//        return null;
//    }
//
//    public void release(){
//        POOL[position] = null;
//    }
//
//    public int getPosition(){
//        return position;
//    }
//}