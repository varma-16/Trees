package BinarySearch_Trees;

public class CheckBST {
    static Node root;

    static boolean check_bst(Node root, int a, int b) {
        if (root == null) {
            return true;
        }
        if (root.data <= a || root.data >= b)
            return false;
        return check_bst(root.left, a, root.data) && check_bst(root.right, root.data, b); // left and right
    }

    public static void main(String[] args) {
        root = Tree.createTree();
        int b = Integer.MAX_VALUE;
        int a = Integer.MIN_VALUE;
        System.out.println(check_bst(root, a, b));
    }
}
