public class bt_height_of_tree {
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
    static class BinaryTree {
      static int idx=-1;
    //   public static Node BuildTree(int nodes[]){
    //     idx++;
    //     if(nodes[idx]==-1){
    //         return null;
    //     }
    //     Node newNode=new Node(nodes[idx]);
    //     newNode.left=BuildTree(nodes);
    //     newNode.right=BuildTree(nodes);
    //     return newNode;

    //   }
       public static int Tree_height(Node root){
        if(root==null){
            return 0;
        }
        int lh=Tree_height(root.left);
        int rh=Tree_height(root.right);
        int height=Math.max(lh, rh)+1;
        return height;

       }
       public static int Tree_Diametre(Node root){
        if(root==null){
            return 0;
        }
         int lh=Tree_height(root.left);
         int rh=Tree_height(root.right);
         int lDia=Tree_Diametre(root.left);
         int rDia=Tree_Diametre(root.right);
         int selfDia=(lh+rh)+1;

         return Math.max(selfDia,Math.max(lDia, rDia));
       }
        
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
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        BinaryTree bt=new BinaryTree();
        
        System.out.println(bt.Tree_height(root));
        System.out.println(bt.Tree_Diametre(root));

    }
   
}
