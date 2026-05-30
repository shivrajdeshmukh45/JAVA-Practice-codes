import java.io.*;
import java.util.*;

public class Main {

    private static final Object lock = new Object();
    private static volatile int n = 0;
    private static volatile boolean inputReady = false;

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                synchronized (lock) {
                    try {
                        Scanner sc = new Scanner(System.in);
                        n = sc.nextInt();           // read input number
                        inputReady = true;
                        lock.notify();              // notify t2 that input is ready
                        lock.wait();                // wait (as per requirement)
                    } catch (Exception e) {
                        // ignore exceptions
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                synchronized (lock) {
                    try {
                        while (!inputReady) {       // wait until input is provided
                            lock.wait();
                        }
                        long fact = 1;
                        for (int i = 1; i <= n; i++) {
                            fact *= i;
                        }
                        System.out.println(fact);   // print factorial
                        lock.notify();              // notify t1 again (though only one round)
                    } catch (Exception e) {
                        // ignore exceptions
                    }
                }
            }
        });

        try {
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("An exception has occured!");
        }
    }
}