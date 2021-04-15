package problem1299;

public class Solution {

  public int[] replaceElements(int[] arr) {
    int temp = arr[arr.length - 1];
    for (int i = arr.length - 2; i >= 0; i--) {

      if (temp > arr[i + 1]) {
        int a = temp;
        temp = arr[i];
        arr[i] = a;
      } else {
        temp = arr[i];
        arr[i] = arr[i + 1];
      }
    }
    arr[arr.length - 1] = -1;
    return arr;
  }
}
