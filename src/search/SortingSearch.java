package src.search;

import java.util.Arrays;

public class SortingSearch {


    public static void main(String[] args) {
        System.out.println("Sorting Array");
        int[] unsortedArray = {5, 3, -1, 55, 12, -12};
        System.out.println(Arrays.toString(sortingSearch(unsortedArray)));
    }


    public static int[] sortingSearch(int array[]){
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int min = array[i];
            int indexOfMin = i;
            for (int j = i+1; j < length; j++) {
                if(array[j] < min){
                    min = array[j];
                    indexOfMin = j;
                }
            }
            swap(array, i, indexOfMin);
        }
        return array;
    }

    private static void swap(int[] number, int a, int b) {
        int temp = number[a];
        number[a] = number[b];
        number[b] = temp;
    }
}
