package eidi.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    private final List<T> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    /**
     * Fügt ein neues Element zum Stack hinzu
     * @param t Element was zum Stack hinzugefügt werden soll
     */
    public void push(T t) {
        stack.add(t);
    }

    public T pop() {
        if (stack.size() >= 1) {
            T topElement = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return topElement;
        } else {
            return null;
        }
    }

    public void clearStack() {
        stack.clear();
    }

    // Return list of Objects here since everything is a subclass of Object in Java
    public Object[] getStackContent() {
        Object[] result = new Object[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            result[i] = stack.get(i);
        }
        return result;
    }
}
