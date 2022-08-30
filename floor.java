package BinarySearch_Trees;

public class floor {
    static Node root;

    public static void main(String[] args) {
        int floor_val = -1;
        root = Tree.createTree();
        while (root != null) {
            if (root.data == 9) {
                floor_val = root.data;
                break;
            }
            if (root.data < 9) {
                floor_val = root.data;
                root = root.right;
            } else {
                root = root.left;
            }
        }
        System.out.println(floor_val);
    }

}
