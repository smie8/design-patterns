package com.designpatterns.singleton;

import com.designpatterns.singleton.singletons.Singleton;
import com.designpatterns.singleton.singletons.SingletonSynchronized;

public class SingletonTestDrive {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getUniqueInstance();
        System.out.println(singleton);
        Singleton singleton2 = Singleton.getUniqueInstance();
        System.out.println(singleton2);
        System.out.println("Singleton 1 and 2 are pointing to same instance: " + (singleton == singleton2));

        testSingletonThreadSafety();
    }

    public static void testSingletonThreadSafety() {
        int numThreads = 50;
        Thread[] threads = new Thread[numThreads];
        SingletonSynchronized[] singletons = new SingletonSynchronized[numThreads];

        // Create threads and access Singleton instances
        for (int i = 0; i < numThreads; i++) {
            final int threadNum = i;
            threads[i] = new Thread(() -> {
                // Access the Singleton instance within the thread
                singletons[threadNum] = SingletonSynchronized.getUniqueInstance();
            });
            threads[i].start();
        }

        // Wait for all threads to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Verify that all threads got the same Singleton instance
        SingletonSynchronized firstSingleton = singletons[0];
        boolean allSameInstance = true;
        for (int i = 1; i < numThreads; i++) {
            if (singletons[i] != firstSingleton) {
                allSameInstance = false;
                break;
            }
        }

        System.out.println("All threads got the same Singleton instance: " + allSameInstance);
    }
}
