

public class bst_isvalid {
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

     public static void inOrder(Node root){
        if(root==null){return;}
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static boolean isvalid(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }else if(max!=null && root.data>=max.data){
            return false;
        }
        return isvalid(root.left, min, root) &&
        isvalid(root.right, root, max);
    }
    public static void main(String[] args) {
         int val[] = { 1,1,1 };
        Node root=null;
        for(int i=0;i<val.length;i++){
            root=insert(root,val[i]);
        }
        inOrder(root);
        System.out.println();
        System.out.println(isvalid(root, null,null));

     
      
      
       
    }
}
