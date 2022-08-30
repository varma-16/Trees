package BinarySearch_Trees;

public class Inorder_Successor {
    static Node root;

    public Node inorderSuccessor(Node root, Node x) { // geeks for geeks
        Node suc = null;
        while (root != null) {
            if (root.data > x.data) {
                suc = root;
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return suc;
    }

    public static void main(String[] args) {
        root = Tree.createTree();
    }

}
