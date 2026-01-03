import java.util.*;
import java.util.LinkedList;

public class bt_rightView {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static ArrayList<Integer>RightView(Node root){
        ArrayList<Integer> arr=new ArrayList<>();
        Queue<Node>q=new LinkedList<>();
        if(root==null)return arr;
        q.add(root);
        while (!q.isEmpty()) {
            int size=q.size();
            for(int i=0;i<size;i++){
                Node curr=q.remove();
                if(i==size-1){
                    arr.add(curr.data);
                }
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);


            }
           
            
        }
         return arr;

    }
   public static void main(String[] args) {
        /*
         * Constructed binary tree is
         * //  1
         * // / \
         * // 2 3
         * // / \ / \
         * // 4 5 6 7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(RightView(root));;
    }
}
