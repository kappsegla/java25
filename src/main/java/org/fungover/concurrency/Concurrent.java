package org.fungover.concurrency;

public class Concurrent {

    static void main() throws InterruptedException {
        BankAccount bankAccount = new BankAccount();

        var t1 = Thread.ofVirtual().name("VThread-0").start(() -> run(bankAccount));
        var t2 = Thread.ofVirtual().name("VThread-1").start(() -> run(bankAccount));
        var t3 = Thread.ofVirtual().name("VThread-2").start(() -> run(bankAccount));
        var t4 = Thread.ofVirtual().name("VThread-3").start(() -> run(bankAccount));

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        System.out.println("Balance: " + bankAccount.getBalance());
    }

    public static void run(BankAccount bankAccount) {
        int i = 0;
        while (i < 100000) {
            bankAccount.adjustBalance(1);
            i++;
        }
    }
}
