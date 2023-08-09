package src;

import src.search.BinarySearch;

public class Main {

    public static void main(String[] args) {

        BinarySearch bs = new BinarySearch();

        //testing the application
        //creating an sorted array
        int[] sortedArray = { 22, 44, 51, 59, 64, 67, 68, 81, 91, 94, 114, 132, 144, 148, 149, 154, 163, 181, 196, 197};
        System.out.println(bs.binarySearch(sortedArray,92));
        //The binary is a Log2n
        //log of 1is always 0
        //ask the base if youre not sure
        //doubling the size of a list will equate to log2n= x+1
        //time complexity (how long it will take it)
        //space complexity (how much memory we will need)
        //n represents the number of inputs
        //the growth of the number of operation will determine how fast the operation is. Not measured directly in secs

    }
}
