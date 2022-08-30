package BinarySearch_Trees;

import java.util.*;

public class BST_iterator {
    static Node root;
    static Stack<Node> stack = new Stack<>();

    public static boolean hasNext() {
        return (!stack.empty());
    }

    public static int next() {
        Node temp = stack.pop();
        if (temp == null)
            return 0;
        pushAllleft(temp.right);
        return temp.data;
    }

    public static void pushAllleft(Node root) {
        for (; root != null; stack.push(root), root = root.left) {

        }
    }

    public static void main(String[] args) {
        root = Tree.createTree();
        pushAllleft(root);

        System.out.println(stack);
        System.out.println(next());
        System.out.println(next());
        System.out.println(next());
        System.out.println(hasNext());
        System.out.println(next());
        System.out.println(stack);

    }
}
