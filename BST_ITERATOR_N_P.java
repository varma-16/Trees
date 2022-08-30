package BinarySearch_Trees;

import java.util.*;

public class BST_ITERATOR_N_P {
    Stack<Node> stack = new Stack<>();
    boolean reverse = false;

    // variables
    BST_ITERATOR_N_P(Node root, boolean reverse) {
        this.reverse = reverse;
        // stack.push(root);
        pushAll(root, reverse);
    }

    public int next() {
        Node temp = stack.pop();
        if (reverse == true) {
            pushAll(temp.left, reverse);
        } else {
            pushAll(temp.right, reverse);
        }
        return temp.data;
    }

    public boolean hasNext() {
        return !(stack.empty());
    }

    public void pushAll(Node root, boolean reverse) {
        while (root != null) {
            stack.push(root);
            if (reverse == true) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
    }

}
