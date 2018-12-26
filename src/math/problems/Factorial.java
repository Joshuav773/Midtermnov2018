package math.problems;

import java.util.Scanner;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Provide an Integer number to Find it's FACTORIAL");
        int n = sc.nextInt(); // provide int value to find factorial

        long result = fact(n);

        System.out.println("the factorial of " + n + " is " + result);
    }

    public static long fact(int n) {
        if (n == 0)
            return 1;
        else
            return n * fact(n - 1);
    }
}
