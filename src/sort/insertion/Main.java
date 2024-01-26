package src.sort.insertion;

import java.util.Arrays;

public class Main {
    //left to right insertion
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        // start with the second index because we assume that the array at the far right is sorted
        for (int firstUnosrtedIndex = 1; firstUnosrtedIndex < intArray.length; firstUnosrtedIndex++){
            int newElement = intArray[firstUnosrtedIndex];

            int i;

            for (i = firstUnosrtedIndex; i > 0 && intArray[i-1] > newElement; i--){
                intArray[i] = intArray[i-1];
            }
            intArray[i] = newElement; 
        }



        System.out.println(Arrays.toString(intArray));
    }

}
