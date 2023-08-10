package src.search;

import java.util.Arrays;

/**
 * @author malli
 * @apiNote Stack Implementation using arrays.
 * Functions: pop(), peak(), push().
 */

public class Stack {

    int[] stackArray;
    int top = 0;

    public Stack(int num){
        this.stackArray = new int[num];
    }

    public int pop(){

        int data;
        top--;
        data = stackArray[top];
        stackArray[top] = 0;
        return data;
    }

    public void push(int data){
        stackArray[top] = data;
        top++;
    }

    public int peak(){
        int data = stackArray[top-1];
        return data;
    }

    public int side(){
        return top;
    }

    public boolean isEmpty(){

        return top <= 0;
    }




    public void show(){
        System.out.println(Arrays.toString(stackArray));
    }

}
