package problem31;

import java.util.Stack;

public class Solution {
  public boolean validateStackSequences(int[] pushed, int[] popped) {
    Stack<Integer> stack = new Stack<>();
    for (int i = 0, j = 0; i < pushed.length || j < popped.length;) {
      if (!stack.isEmpty() && stack.peek() == popped[j]) {
        stack.pop();
        j++;
        continue;
      } else if (i < pushed.length) {
        stack.push(pushed[i++]);
      }
      if (i >= pushed.length && stack.peek() != popped[j]) {
        break;
      }
    }
    return stack.isEmpty();
  }
}
