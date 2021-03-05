package problem03;

import java.util.HashSet;
import java.util.Set;

/**
 * 哈希表 时间O(n)，空间O（n）
 *
 * @author lurunze
 */
public class Solution {

  public int findRepeatNumber(int[] nums) {
    Set<Integer> numberSet = new HashSet<>();
    for (int num : nums) {
      if (numberSet.contains(num)) {
        return num;
      }
      numberSet.add(num);
    }
    return -1;
  }
}
