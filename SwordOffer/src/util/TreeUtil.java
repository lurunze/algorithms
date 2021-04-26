package util;

import java.util.LinkedList;
import java.util.List;

public class TreeUtil {

    public static TreeNode ListToTree(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i = 0;
        TreeNode root = new TreeNode(list.get(i++));
        LinkedList<TreeNode> treeNodeList = new LinkedList<>();
        treeNodeList.add(root);
        while (!treeNodeList.isEmpty()) {
            TreeNode node = treeNodeList.removeFirst();
            if (i < list.size()) {
                Integer integer =  list.get(i++);
                TreeNode left = null;
                if (integer != null) {
                    left = new TreeNode(integer);
                }
                node.left = left;
                treeNodeList.add(left);
            }
            if (i < list.size()) {
                Integer integer =  list.get(i++);
                TreeNode right = null;
                if (integer != null) {
                    right = new TreeNode(integer);
                }
                treeNodeList.add(right);
                node.right = right;
            }
        }
        return root;
    }
}
