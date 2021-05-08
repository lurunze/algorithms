package problem36;

public class Solution {
    Node pre = new Node();
    Node head = pre;

    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }
        helper(root);
        head.right.left = pre;
        pre.right = head.right;
        return head.right;
    }

    private void helper(Node root) {
        if (root.left != null) {
            helper(root.left);
        }

        pre.right = root;
        root.left = pre;
        pre = root;

        if (root.right != null) {
            helper(root.right);
        }
    }
}
