package problem09;

import java.util.Stack;

class CQueue {

    private final Stack<Integer> stack1;
    private final Stack<Integer> stack2;

    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack1.empty()) {
            return -1;
        }

        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        int result = stack2.pop();

        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }

        return result;
    }
}
