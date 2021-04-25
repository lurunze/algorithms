package problem20;

public class Solution {

  public boolean isNumber(String s) {
    if (s == null) {
      return false;
    }
    boolean hasNumber = false;
    boolean hasE = false;
    boolean hasPoint = false;
    boolean hasSign = false;
    int index = 0;
    while (index < s.length() && s.charAt(index) == ' ') {
      index++;
    }
    while (index < s.length()) {
      if (s.charAt(index) >= '0' && s.charAt(index) <= '9') {
        hasNumber = true;
      } else if (s.charAt(index) == 'e' || s.charAt(index) == 'E') {
        if (hasE || !hasNumber) {
          return false;
        }
        hasNumber = false;
        hasSign = false;
        hasPoint = false;
        hasE = true;
      } else if (s.charAt(index) == '.') {
        if (hasPoint || hasE) {
          return false;
        }
        hasPoint = true;
      } else if (s.charAt(index) == '+' || s.charAt(index) == '-') {
        if (hasSign || hasNumber || hasPoint) {
          return false;
        } else {
          hasSign = true;
        }
      } else {
        break;
      }
      index++;
    }
    while (index <= s.length() - 1 && s.charAt(index) == ' ') {
      index++;
    }
    return index == s.length() && hasNumber;
  }
}
