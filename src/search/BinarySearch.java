package src.search;
/**
 * @author malli
 * @implSpec Binary class with a binary search method that will find the number in an array in the fastest way possible using the Big O notation of Log2n
 */
public class BinarySearch {


    public int binarySearch(int[] numbers, int findNumber){

        //utilize two pointers
        int low = 0;//this pointer will track the begging of the arrays index
        int high = numbers.length - 1;//this will track the last index of the array

        //this pointer will track the number of steps it took to find the position of the array
        int count = 1;


        while(low <= high){
            //first will create a variable that will store the middle position of the array. We will obtain that value by getting the average number
            int middlePosition = (low+high)/2;
            //second we will get the actual number that's located in the middle of the array by the provided middle position
            int middleNumber = numbers[middlePosition];

            //Lastly we will establish the cases that will determine if the number is actually part of the array by using a conditional statement

            if(findNumber == middleNumber){
                //if the findNUmber equals to the middleNumber the condition will return the index where the number is located in the array
                System.out.println("The number of steps it took to find the number: "+count);
                return middlePosition;
            } else if(findNumber < middleNumber){
                //since this is a sorted array, if the find number is less than the middle number we are going to set the high value to equal the middle position minus 1
                high = middlePosition -1;
            } else{
                //this will focus on setting the low number to a new value. Since by default  the middle number is greater than then findNumber the low pointer value will equal to the middle numberNumber position + 1
                low = middlePosition + 1;
            }
            count++;
        }
        //the application will return the -1 if the findNumber value is not part of the array
        System.out.println("The number of steps it took to find the number: "+count);
        return -1;
    }
}
