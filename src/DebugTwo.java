/**
 * DebugTwo.java
 *
 * A class designed to help practice different debugging methods.
 *
 * Written by Z. Blick & N. Namasivayam on Dec. 02 2022
 * For CS2 @ Menlo School in Atherton, CA
 */

public class DebugTwo {
    public static int loopAddition(int x) {
        for(int i=0; i<100; i++) {
            x += (i%7) * 2;
        }

        return x;
    }

    public static int addOne(int x) {
        return x++;
    }

    public static int addTwo(int x) {
        return x + 2;
    }

    public static int addThree(int x) {
        return addTwo(x++);
    }

    public static int addMeUp(int x) {
        int first = addOne(x);
        int second = addTwo(x);
        int third = addThree(x);
        return first + second + third;
    }

    public static int intOverflow(int[] arr, int x) {
        for(int i=0; i<arr.length; i++) {
            x *= arr[i];
        }

        return x;
    }

    public static int fibonacci(int num) {
        if(num < 1) {
            return num;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void main(String[] args) {
        // Loop Addition
        System.out.println(loopAddition(2));

        // Add Three
        System.out.println(addMeUp(5));

        // Loop Overflow
        int arr[] = {6, 10, 4, 25, 2, 76, 81, 9, 2, 13, 4, 8};
        System.out.println(intOverflow(arr, 2));

        // Fibonacci Sequence
        for(int i=0; i<7; i++) {
            System.out.println(fibonacci(i));
        }

    }
}
