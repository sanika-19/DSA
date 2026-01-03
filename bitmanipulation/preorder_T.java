public class preorder_T {
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
    public static Node BuildTree(int nodes[]){
     idx++;
     if (nodes[idx]==-1) {
        return null;
     }
     Node newnode=new Node(nodes[idx]);
     newnode.left=BuildTree(nodes);
     newnode.right=BuildTree(nodes);
     return newnode;

    }
    public static void PreOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        PreOrder(root.left);
        PreOrder(root.right);
       

    }
      public static void PostOrder(Node root){
        if(root==null){
            return;
        }
        
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data);

      } 
      public static void InOrder(Node root){
        if(root==null){
            return;
        }
        
        InOrder(root.left);
        System.out.print(root.data);
        PostOrder(root.right);
        

      } 
    }
    public static void main(String[] args) {
        int  nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt=new BinaryTree();
        Node root=bt.BuildTree(nodes);
        // bt.PreOrder(root);
        // bt.PostOrder(root);
        bt.InOrder(root);
        // System.out.println(root.data);
    }
}
 
    

