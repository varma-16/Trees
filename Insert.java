package BinarySearch_Trees;

public class Insert {
    static Node root;

    public static void inorder(Node root) { // recursive
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + "  ");
        inorder(root.right);
    }

    static Node insert(Node head, int data) {
        if (head == null) {
            head = new Node(data);
        }
        if (head.data > data) {
            head.left = insert(head.left, data);
        }
        if (head.data < data) {
            head.right = insert(head.right, data);
        }
        return head;
    }

    public static void main(String[] args) {
        root = Tree.createTree();
        // Node root1 = insert(root, 9);
        // inorder(root1);
        // iterative:
        Node temp = root;
        Node prev = root;
        while (temp != null) {
            prev = temp;
            if (temp.data > 9) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
            if (temp == null) {
                if (prev.data > 9) {
                    prev.left = new Node(9);
                } else {
                    prev.right = new Node(9);
                }
            }
        }
        inorder(root);
    }

}
