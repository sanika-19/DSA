import java.util.ArrayList;

public class bst_MergeBst {
    public static class Node {
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
        
    }
    public static Node BalancedBST(ArrayList<Integer>arr,int st,int end){
        if(st>end){
            return null;
        }
     int mid=(st+end)/2;
     Node root=new Node(arr.get(mid));
     root.left=BalancedBST(arr, st, mid-1);
     root.right= BalancedBST(arr, mid+1, end);
     return root;
    }

    public static Node MergeBST(Node root1,Node root2){
        //step1
        ArrayList<Integer>arr1=new ArrayList<>();
        getInorder(arr1, root1);
        //step2
        ArrayList<Integer>arr2=new ArrayList<>();
        getInorder(arr2, root2);
        //step3 merge
        int i=0,j=0;
        ArrayList<Integer>finalList=new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
        if(arr1.get(i)<=arr2.get(j)){
            finalList.add(arr1.get(i));
            i++;
        }else{
            finalList.add(arr2.get(j));
            j++;
        }
        }
        while (i<arr1.size()) {
            finalList.add(arr1.get(i));
            i++;
        }
        while (j<arr2.size()) {
            finalList.add(arr2.get(j));
            j++;
        }
        //step 4 Sortted array->Balnced BST
        return BalancedBST(finalList, 0, finalList.size()-1);
    


    }
    public static void PreOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    public static void getInorder( ArrayList<Integer> inorder,Node root){
        if(root==null){
            return;
        }
        getInorder(inorder, root.left);
        inorder.add(root.data);
        getInorder(inorder, root.right);
    }
    public static void main(String[] args) {
        /* 
         BST 1              BST2
           2               9
          / \             / \
         1   4           3  12
        */
       Node root1=new Node(2);
       root1.left=new Node(1);
       root1.right=new Node(4);
    //              BST-2
    //                 9
    //                / \
    //               3  12
       Node root2=new Node(9);
       root2.left=new Node(3);
       root2.right=new Node(12);
       /*Expected BST
           3
         /   \
        1     9
         \   / \
          2 4  12
       */
      Node root=MergeBST(root1, root2);
      PreOrder(root);
    }
}
