package problem30;

import java.util.Stack;

class MinStack {

  Stack<Integer> stackA;
  Stack<Integer> stackB;

  public MinStack() {
    stackA = new Stack<>();
    stackB = new Stack<>();
  }

  public void push(int x) {
    stackA.push(x);
    if (stackB.isEmpty() || x <= stackB.peek()) {
      stackB.push(x);
    }
  }

  public void pop() {
    if (stackA.pop().equals(stackB.peek())) {
      stackB.pop();
    }
  }

  public int top() {
    return stackA.peek();
  }

  public int min() {
    return stackB.peek();
  }
}