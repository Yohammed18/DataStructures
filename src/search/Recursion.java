package src.search;

import java.util.Arrays;

/**
 * @author malli
 * @apiNote Recursion is a coding technique used in many algorithms. Recursion is a process where the function calls itself until it meets a base case. We often see recursion when we have to handle Node insertion, deletion, and searches
 */
public class Recursion {

    public static void main(String[] args) {
        System.out.println("Recursion display with both Factorial and Fibonacci");

        System.out.println(factorial(5));

        //store the fibonacci value in an array
        int fib = 10;
        int[] fibArray = new int[fib];

        for (int i = 0; i < fibArray.length; i++) {
            fibArray[i] = fibonacci(i);
        }

        System.out.println(Arrays.toString(fibArray));
    }

    private static int fibonacci(int num){

        //create a base case that will prevent the code to go into an infinite loop
        if(num <= 1){
            return num;
        } else{
            return (fibonacci(num-1)+fibonacci(num-2));
        }
    }

    private static int factorial(int num) {

        if(num == 1){
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
