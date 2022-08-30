package BinarySearch_Trees;

public class Kthsmallestelement {
    static Node root;
    static int c = 0;

    public static Node inorder(Node root, int k) {
        if (root == null) {
            return null;
        }
        Node left = inorder(root.left, k);
        if (left != null) {
            return left;
        }
        c++;
        if (c == k) {
            return root;
        }
        return inorder(root.right, k);
    }

    public static void main(String[] args) {
        root = Tree.createTree();
        Node node = inorder(root, 5);
        System.out.println(node.data);

    }
}
