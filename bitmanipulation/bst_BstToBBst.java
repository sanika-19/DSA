import java.util.ArrayList;

public class bst_BstToBBst {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node BalancedBST(Node root) {
        // 1.Inorder Seqence
        ArrayList<Integer> inorder = new ArrayList<>();
        getinorder(root, inorder);
        // 2.Inorder-Balnced BST
        root = BST_TO_BBST(inorder, 0, inorder.size() - 1);
        return root;

    }

    public static Node BST_TO_BBST(ArrayList<Integer> inorder, int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = BST_TO_BBST(inorder, st, mid - 1);
        root.right = BST_TO_BBST(inorder, mid + 1, end);
        return root;
    }

    public static void Preorder(Node root) {
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);
    }

    public static void getinorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }
        getinorder(root.left, inorder);
        inorder.add(root.data);
        getinorder(root.right, inorder);
    }

    public static void main(String[] args) {
        /*
         *  8
         * / \
         * 6 10
         * / \
         * 5 11
         * / \
         * 3 12
         * 
         */
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
         /*
     * expected BST
     *  8
     * / \
     *5   11
     / \  / \
     3  6 10 12
     */
    root=BalancedBST(root);
    Preorder(root);
    }

}
