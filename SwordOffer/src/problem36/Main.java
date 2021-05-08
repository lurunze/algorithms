package problem36;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(4);
        Node node1 = new Node(2);
        Node node2 = new Node(1);
        Node node3 = new Node(3);
        Node node4 = new Node(5);
        root.left = node1;
        root.right = node4;
        node1.left = node2;
        node1.right = node3;
        Solution solution = new Solution();
        solution.treeToDoublyList(root);
    }
}
