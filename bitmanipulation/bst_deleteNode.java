
public class bst_deleteNode {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static boolean Search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return Search(root.left, key);
        } else {
            return Search(root.right, key);
        }

    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static Node Delete(Node root, int val) {
        if (root == null) {
            return root;
        }
        if (root.data < val) {
            root.right = Delete(root.right, val);
        } else if (root.data > val) {
            root.left = Delete(root.left, val);
        } else {// voila case
                // Case 1:Leaf Node
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2:single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Case 3: Two childrens
           Node Is= FindInorderSuccessor(root.right);
           root.data=Is.data;
          root.right= Delete(root.right, Is.data);


        }
        return root;
    }
    public static Node FindInorderSuccessor(Node root){
        while (root.left!=null) {
            root=root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int val[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);
        }
        inOrder(root);
        root=Delete(root, 1);
        System.out.println();
        inOrder(root);
    }
}
