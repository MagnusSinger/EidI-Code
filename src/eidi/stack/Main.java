package eidi.stack;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // String Stack
        Stack<String> stack = new Stack<>();

        stack.push("PGDP W07P04");
        System.out.println("Pushed: " + "PGDP W07P04");
        stack.push("PGDP W07H01");
        System.out.println("Pushed: " + "PGDP W07H01");
        stack.push("PGDP W07H02");
        System.out.println("Pushed: " + "PGDP W07H02");
        stack.push("DS HA");
        System.out.println("Pushed: " + "DS HA");

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        stack.push("ERA HA");
        System.out.println("Pushed: " + "ERA HA");

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        stack.push("PGDP W07P01");
        System.out.println("Pushed: " + "PGDP W07P01");
        stack.push("PGDP W07P02");
        System.out.println("Pushed: " + "PGDP W07P02");

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        stack.push("PGDP W07P03");
        System.out.println("Pushed: " + "PGDP W07P03");

        System.out.println("String Stack content before clear:");
        System.out.println(Arrays.toString(stack.getStackContent()));
        stack.clearStack();
        System.out.println("String Stack content after clear:");
        System.out.println(Arrays.toString(stack.getStackContent()));

        System.out.println("\n");

        // Int Stack
        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(-4);
        System.out.println("Pushed -4");
        integerStack.push(0);
        System.out.println("Pushed 0");
        integerStack.push(19039);
        System.out.println("Pushed 19039");
        integerStack.push(2021);
        System.out.println("Pushed 2021");

        System.out.println("Popped " + integerStack.pop());

        System.out.println("Integer Stack content before clear:");
        System.out.println(Arrays.toString(integerStack.getStackContent()));
        integerStack.clearStack();
        System.out.println("Integer Stack content after clear:");
        System.out.println(Arrays.toString(integerStack.getStackContent()));
    }

}
