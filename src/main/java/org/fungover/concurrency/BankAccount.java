package org.fungover.concurrency;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class BankAccount {

    private int balance;

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void adjustBalance(int amount) {
        var writeLock = lock.writeLock();
        writeLock.lock();
        try {
            balance = balance + amount;
        } finally {
            writeLock.unlock();
        }
    }

    public int getBalance() {
        var readLock = lock.readLock();
        readLock.lock();
        try {
            return balance;
        } finally {
            readLock.unlock();
            ;
        }
    }
}
