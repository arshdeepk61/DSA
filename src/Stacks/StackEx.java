package Stacks;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<>();
 /*       stack.push(1);
        stack.push(2);
        stack.push(3);*/

        int deleted=stack.pop(); // empty stack exception if no elements in stack
        System.out.println(deleted);

        stack.remove(1); // Array index out of bound exception
        System.out.println(stack);

        //Search
        System.out.println("Position of 1: "+stack.search(1));

        /*while(!stack.isEmpty()) {
            System.out.println("Element popped: " + stack.pop()); // To remove the element
            System.out.println("Remaining stack: " + stack);
        }*/


    }
}
