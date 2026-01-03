public class bt_nodeCount {
    static class Node {
       int data;
       Node left;
       Node right;
       Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
       }
       
        
    }
    static int Count_Node(Node root){
            if(root==null){
                return 0;
            }
            int lcount=Count_Node(root.left);
            int rcount=Count_Node(root.right);
            return (lcount+rcount)+1;
        }
    public static void main(String[] args) {
          // Constructed binary tree is
        //         1
        //        / \
        //       2   3
        //      / \
        //     4   5
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        System.out.println(Count_Node(root));

    }
}
