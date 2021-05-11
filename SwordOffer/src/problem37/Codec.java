package problem37;

import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Codec {
    public String serialize(TreeNode root) {
        if(root == null) {
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder("[");
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                stringBuilder.append(node.val).append(",");
                queue.offer(node.left);
                queue.offer(node.right);
            } else {
                stringBuilder.append("null,");
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public TreeNode deserialize(String data) {
        if(data.equals("[]")) {
            return null;
        }
        String[] strs = data.substring(1, data.length() - 1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(strs[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (i < strs.length && !"null".equals(strs[i])) {
                TreeNode left = new TreeNode(Integer.parseInt(strs[i]));
                node.left = left;
                queue.add(left);
            }
            i++;

            if (i < strs.length && !"null".equals(strs[i])) {
                TreeNode right = new TreeNode(Integer.parseInt(strs[i]));
                node.right = right;
                queue.add(right);
            }
            i++;
        }
        return root;
    }
}
