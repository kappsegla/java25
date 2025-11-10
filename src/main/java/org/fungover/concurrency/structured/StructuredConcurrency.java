package org.fungover.concurrency.structured;

import java.time.Duration;
import java.util.concurrent.StructuredTaskScope;

public class StructuredConcurrency {
    static void main() {

        try (var scope = StructuredTaskScope.open(
                StructuredTaskScope.Joiner.allSuccessfulOrThrow(),
                configuration -> configuration.withTimeout(Duration.ofMillis(4000)))) {

            var profile = scope.fork(() -> getProfile());
            var permissions = scope.fork(() -> getPermissions());
            scope.join();

            User user = new User(profile.get(), permissions.get());
            System.out.println(user);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (StructuredTaskScope.FailedException e) {
            System.out.println("Failed to get User data");
        } catch (StructuredTaskScope.TimeoutException timeout) {
            System.out.println("Timeout...");
        }
    }

    public static String getProfile() {
        //Simulate network or database call
        try {
            Thread.sleep(2000);
            //throw new RuntimeException();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "User profile text goes here.";
    }

    public static String getPermissions() {
        //Simulate network or database call
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
            throw new RuntimeException(e);
        }
        return "No permissions at all.";
    }


}
