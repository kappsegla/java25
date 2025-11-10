package org.fungover.concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsyncDemo {


    static void main() throws InterruptedException, ExecutionException {

        //Call an async method
        CompletableFuture<String> future = doSomethingAsync();

        //Register a method to run when a result is available
        future.thenAccept(System.out::println);
        future.exceptionally((throwable -> {
            System.out.println(throwable.getMessage());
            return "";
        }));

        Thread.sleep(10000);
    }

    public static CompletableFuture<String> doSomethingAsync() {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        //Long-running task in a background thread
        Thread.ofVirtual().start(() -> {
            try {
                //Simulate slow method execution
                Thread.sleep(3000);
                //throw new InterruptedException();
            } catch (InterruptedException e) {
                completableFuture.completeExceptionally(new RuntimeException("Exception happened"));
            }
            //Update future with a result
            completableFuture.complete("We are done!");
        });
        return completableFuture;
    }


}
