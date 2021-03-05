package problem05;

public class Solution {

  public String replaceSpace(String s) {
    if (s == null || s.isEmpty()) {
      return s;
    }
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ' ') {
        stringBuilder.append("%20");
      } else {
        stringBuilder.append(s.charAt(i));
      }
    }
    return stringBuilder.toString();
  }

}
