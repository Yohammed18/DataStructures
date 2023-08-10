package src;

import src.search.Stack;

public class Main {

    public static void main(String[] args) {

        Stack stack = new Stack(5);

        System.out.println(stack.isEmpty());

        stack.push(3);
        stack.push(23);
        stack.push(45);
        stack.push(63);
        stack.push(-1);
        System.out.println(stack.peak());

        stack.show();
        System.out.println(stack.pop());
        stack.show();
        System.out.println(stack.peak());

        System.out.println(stack.isEmpty());

    }
}
