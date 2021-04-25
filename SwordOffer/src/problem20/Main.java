package problem20;

public class Main {

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.isNumber("+100"));
    System.out.println(solution.isNumber("5e2"));
    System.out.println(solution.isNumber("-123"));
    System.out.println(solution.isNumber("3.1416"));
    System.out.println(solution.isNumber("-1E-16"));
    System.out.println(solution.isNumber("0123"));
    System.out.println(solution.isNumber("12e"));
    System.out.println(solution.isNumber("1a3.14"));
    System.out.println(solution.isNumber("1.2.3"));
    System.out.println(solution.isNumber("+-5"));
    System.out.println(solution.isNumber("12e+5.4"));
    System.out.println(solution.isNumber(" "));
  }
}
