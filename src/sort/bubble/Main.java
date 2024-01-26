package src.sort.bubble;

import src.Swap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("BEFORE BUBBLE SORT - Time Complexity: O n^2");
        System.out.println(Arrays.toString(intArray));

        for (int lastUnsortedindex = intArray.length - 1; lastUnsortedindex > 0; lastUnsortedindex--) {
            for (int i = 0; i < lastUnsortedindex ; i++) {
                if (intArray[i] > intArray[i+1]){
                    Swap.swap(intArray, i, i+1);
                }
            }
        }
        System.out.println("\nAFTER BUBBLE SORT - Time Complexity: O n^2");
        System.out.println(Arrays.toString(intArray));

    }
}
