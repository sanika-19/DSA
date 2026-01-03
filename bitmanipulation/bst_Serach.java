public class bst_Serach {
   public static class Node {
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
    }   
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;}
        if(root.data>val){
            root.left=insert(root.left, val);
        }
        else{
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static void inOrder(Node root){
        if(root==null){return;}
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static boolean Search(Node root,int key){
     if(root==null){
        return false;
     }
     if(root.data==key){
        return true;
     }
     if(root.data>key){
        return Search(root.left, key);
     }else{
       return Search(root.right, key);
     }
     
    }
    public static void main(String[] args) {
        int val[] = { 6, 1, 3, 5, 7, 2, 8, 4 };
        Node root=null;
        for(int i=0;i<val.length;i++){
            root=insert(root,val[i]);
        }
       inOrder(root);
       int key=-1;
       System.out.println("\n"+Search(root, key));
    }
}
