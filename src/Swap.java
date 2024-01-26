package src;

public class Swap {

    public static void main(String[] args) {
        //Arrays
        int[] array = new int[7];
        array[0] = 20;
        array[1] = 35;
        array[2] = -15;
        array[3] = 7;
        array[4] = 55;
        array[5] = 1;
        array[6] = -22;


        int index = -1;
        for (int i = 0; i < array.length; i++) {
            index = 1;
            break;
        }

        System.out.println("Index = "+index);
    }


    public static void swap(int[] array, int i, int j){
        if (i == j) return;
        //create a temp to hold the array
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
