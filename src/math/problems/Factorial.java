package math.problems;

import java.time.Clock;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        int x = 5;
        int i;
        int total=1;
        for(i=1;i<=x;i++){
            total=total*i;
        }
        System.out.println(total);
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

    }
}
