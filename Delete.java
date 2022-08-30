package BinarySearch_Trees;

public class Delete {
    static Node root;

    public static void inorder(Node root) { // recursive
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + "  ");
        inorder(root.right);
    }

    static Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    static Node delete(Node root, int data) {
        if (root == null) {
            return null;
        }
        if (root.data > data) {
            root.left = delete(root.left, data);
        } else if (root.data < data) {
            root.right = delete(root.right, data);
        } else {
            // if they are equal:
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                Node temp = findMin(root.right);
                // int rdata=root.data;
                root.data = temp.data;
                root.right = delete(root.right, root.data);
                return root;
            }
        }
        return root;

    }

    public static void main(String[] args) {
        root = Tree.createTree();
        Node d = delete(root, 9);
        inorder(d);

    }
}
