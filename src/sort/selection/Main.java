package src.sort.selection;

import src.Swap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("BEFORE SELECTION SORT - Time Complexity: O n^2");
        System.out.println(Arrays.toString(intArray));

        for(int unSortedIndex = intArray.length - 1;unSortedIndex > 0; unSortedIndex--){
            int largest = 0;
            for (int i = 0; i <= unSortedIndex ; i++) {
                if(intArray[i] > intArray[largest]){
                    largest = i;
                }
            }
            Swap.swap(intArray, largest, unSortedIndex);
        }

        System.out.println("\nAFTER BUBBLE SORT - Time Complexity: O n^2");
        System.out.println(Arrays.toString(intArray));
    }
}
