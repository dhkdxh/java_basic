package day16;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> stack_int = new Stack<>();

        stack_int.push(1);
        stack_int.push(2);
        stack_int.push(3);

        System.out.println(stack_int);

        stack_int.pop();

        System.out.println(stack_int);
    }
}
