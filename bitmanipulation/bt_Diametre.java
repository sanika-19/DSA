
public class bt_Diametre {
     static class Node {
     int data;
     Node left;
     Node right;
     Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
     }
     public static int diametre(Node root){
        if(root==null){
            return 0;
        }
        int ld=diametre(root.left);
        int lh=height(root.left);
        int rd=diametre(root.right);
        int rh=height(root.right);
        int selfDia=(ld+rd)+1;
        return Math.max(selfDia, Math.max(ld, rd));
     }
     static class Info{
       int dia,ht;
       public Info(int dia,int ht){
        this.dia=dia;
        this.ht=ht;
       }
       public static Info diametre1(Node root){
        Info lInfo=diametre1(root.left);
        Info rInfo=diametre1(root.right);
       }
     }
        
     }
    public static void main(String[] args) {
         Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
    }
}
