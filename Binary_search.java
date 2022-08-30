package BinarySearch_Trees;

public class Binary_search {
    static Node root;

    static Node bin_search(Node root, int data) {
        while (root.data != data && root != null) {
            root = (root.data > data) ? root.left : root.right;
        }
        return root;
    }

    public static void main(String[] args) {
        root = Tree.createTree();
        System.out.println(bin_search(root, 5));

    }
}
