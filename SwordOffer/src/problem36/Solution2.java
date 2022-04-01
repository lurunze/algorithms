package problem36;

public class Solution2 {
    Node pre, head;

    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }
        helper(root);
        pre.right = head;
        head.left = pre;
        return head;
    }

    private void helper(Node root) {
        if (root == null) {
            return;
        }
        helper(root.left);
        if (pre != null) {
            pre.right = root;
        } else {
            head = root;
        }
        root.left = pre;
        pre = root;

        helper(root.right);
    }
}
