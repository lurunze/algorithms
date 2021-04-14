package problem001;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
  public int[] twoSum(int[] nums, int target) {
    if (nums == null || nums.length < 2) {
      return null;
    }
    Map<Integer, Integer> map = new HashMap<>(16);
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target - nums[i])) {
        return new int[]{i, map.get(target - nums[i])};
      }
      map.put(nums[i], i);
    }
    return null;
    }
}
