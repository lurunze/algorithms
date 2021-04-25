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
                TreeNode left = new TreeNode(list.get(i++));
                node.left = left;
                treeNodeList.add(left);
            }
            if (i < list.size()) {
                TreeNode right = new TreeNode(list.get(i++));
                treeNodeList.add(right);
                node.right = right;
            }
        }
        return root;
    }
}
