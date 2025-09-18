package org.fungover.exercises.week3;

public class SemaphoreDemo {
    static void main() {
        // Försöker att få ett objekt
        Semaphore.Resource r1 = Semaphore.request();
        if (r1 != null) {
            System.out.println("Fick resurs 1.");
        }

        // Försöker få ett andra objekt
        Semaphore.Resource r2 = Semaphore.request();
        if (r2 != null) {
            System.out.println("Fick resurs 2.");
        }

        // Försöker få ett tredje objekt
        Semaphore.Resource r3 = Semaphore.request();
        if (r3 != null) {
            System.out.println("Fick resurs 3.");
        }

        // Försöker få ett fjärde objekt (detta kommer att misslyckas)
        Semaphore.Resource r4 = Semaphore.request();
        if (r4 == null) {
            System.out.println("Ingen resurs tillgänglig, fick null.");
        }

        // Lämnar tillbaka resurs 1
        System.out.println("Släpper resurs 1.");
        r1.release();

        // Försöker igen, nu borde det gå att få ett objekt
        Semaphore.Resource r5 = Semaphore.request();
        if (r5 != null) {
            System.out.println("Fick resurs 5.");
        }
    }
}
