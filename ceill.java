package BinarySearch_Trees;

public class ceill {
    static Node root;
    static int ceil_val = 0;

    // ceil means nearest larger value:
    static void ceil(Node root, int key) {
        if (root == null) {
            return;
        }
        if (root.data == key) {
            ceil_val = root.data;
            return;
        }
        if (root.data > key) {
            ceil_val = root.data;
            ceil(root.left, key);
        } else {
            ceil(root.right, key);
        }

    }

    public static void main(String[] args) {
        root = Tree.createTree();
        // ceil(root, 5); ---> recursive:
        // System.out.println(ceil_val);
        // Iterative method:
        while (root != null) {
            if (root.data == -1) {
                ceil_val = root.data;
                break;
            }
            if (root.data > -1) {
                ceil_val = root.data;
                root = root.left;
            } else {
                root = root.right;
            }
        }
        System.out.println(ceil_val);

    }
}
