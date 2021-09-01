package com.tasks;

import java.sql.Array;

public class FibonacciTriangle {

    public static void fibonacci(long[] fibArr, int count) {

        //Adding first and second number of Fibonacci series
        fibArr[1] = 1;
        fibArr[2] = 1;
        // Successive number will be the count of its two predecessors
        for (int i = 3; i <= count; i++) {
            fibArr[i] = fibArr[i-1] + fibArr[i-2];
        }

    }


    public static void fibonacciTriangle(int number, boolean isMirror) {
        // numCount will be the count of Fibonacci numbers
        int numCount = number * (number + 1) / 2;
        // Initializing a new array with size of numCount
        long[] fib = new long[numCount + 1];
        // This method saves all the Fibonacci numbers in the fib array.
        fibonacci(fib, numCount);

        if (!isMirror) {

            int fibIndex = 0;
            for (int i = 0; i < number; i++) {

                for (int j = 0; j <= i  ; j++) {

                    System.out.print(fib[fibIndex++] + " ");
                }
                System.out.println();
            }

        } else {

            int fibIndex = numCount-1;
            for (int i = number ; i > 0; i--) {

                for (int j = i ; j > 0  ; j--) {

                    System.out.print(fib[fibIndex--] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

       fibonacciTriangle(5, false);

    }
}

