package Java.week_1;

import java.util.HashMap;

public class Fibonacci {
    static HashMap<Integer, Long> cache = new HashMap<>();

    public static void main(String[] args) {
        fibonacciSequence(10);
    }

    static public void fibonacciSequence(int a) {
        for (int i = 0; i <= a; i++) {
            System.out.println(i + ": " + fibonacci(i));
        }
    }


    static public long fibonacci(int a) {
        if (a == 0) {
            return 0;
        } else if (a == 1) {
            return 1;
        }

        if (cache.containsKey(a)) {
            return cache.get(a);
        } else {
            long fib = fibonacci(a - 1) + fibonacci(a - 2);
            cache.put(a, fib);
            return fib;
        }
    }
}