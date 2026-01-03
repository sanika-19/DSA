import org.w3c.dom.Node;

public class bt_MInDepth {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    public static int MinDepth(Node root){
        if(root==null)return 0;
        if(root.left==null && root.right==null)return 1;
        if(root.left==null)return MinDepth(root.right)+1;
        if(root.right==null)return MinDepth(root.left)+1;
        return Math.min(MinDepth(root.left),MinDepth(root.right))+1;
    }
    public static void main(String[] args) {
          // Constructed binary tree is
        //         1
        //        / \
        //       2   3
        //      / \
        //     4   5
        Node root = new Node(1);
        // root.left = new Node(2);
        // // root.right = new Node(3);
        // root.left.left = new Node(4);
        // root.left.right = new Node(5);
        System.out.println(MinDepth(root));

    }
}
