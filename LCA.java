package BinarySearch_Trees;

public class LCA {
    static Node root;

    public static Node lca(Node root, int a, int b) {
        if (root == null) {
            return null;
        }
        if (root.data > a && root.data > b) {
            return lca(root.left, a, b);
        }
        if (root.data < a && root.data < b) {
            return lca(root.right, a, b);
        }
        return root;
    }

    public static void main(String[] args) {
        root = Tree.createTree();
        System.out.println(lca(root, 0, 3).data);
    }

}
