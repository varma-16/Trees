package BinarySearch_Trees;

public class TwoSum {
    static Node root;

    public static void main(String[] args) {
        root = Tree.createTree();
        BST_ITERATOR_N_P r = new BST_ITERATOR_N_P(root, true);
        BST_ITERATOR_N_P l = new BST_ITERATOR_N_P(root, false);
        int i = l.next();
        int j = r.next();
        int sum = 15;
        while (i < j) {
            if (i + j == sum) {
                System.out.println("Yes");
                break;
            }
            if (i + j > sum) {
                j = r.next();
            } else {
                i = l.next();
            }
        }
        System.out.println("hello");

    }

}
