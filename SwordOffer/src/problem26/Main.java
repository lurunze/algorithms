package problem26;

import util.TreeNode;
import util.TreeUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {4,2,3,4,5,6,7,8,9};
        List<Integer> list1 = Arrays.stream(array1).boxed().collect(Collectors.toList());
        TreeNode a = TreeUtil.ListToTree(list1);

        int[] array2 = {4,8,9};
        List<Integer> list2 = Arrays.stream(array2).boxed().collect(Collectors.toList());
        TreeNode b = TreeUtil.ListToTree(list2);
        Solution solution = new Solution();
        System.out.println(solution.isSubStructure(a, b));
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.isSubStructure(a, b));
    }
}
