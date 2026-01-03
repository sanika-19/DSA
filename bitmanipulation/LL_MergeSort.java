
public class LL_MergeSort {
    public static class Node{
         int data;
         Node next;
         public Node(int data){
            this.data=data;
            this.next=null;
         }
    }
    public static Node head;
    public static Node tail;
    //methods 
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            System.out.println("LL is Empty!");
        }
        newNode.next=head;
        head=newNode;
    }

    public Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public Node merge(Node lNode,Node rNode){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        if(lNode.data<rNode.data){
            temp.next=lNode;
            lNode=lNode.next;
            temp=temp.next;
        }else{
            temp.next=rNode;
            rNode=rNode.next;
            temp=temp.next;
        }

        while(lNode!=null){
            temp.next=lNode;
            lNode=lNode.next;
            temp=temp.next;
        }
        while (rNode!=null) {
            temp.next=rNode;
            rNode=rNode.next;
            temp=temp.next;
        }
        return mergedLL.next;
    }
     public Node MergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        //Find Mid
        Node mid=getMid(head);
        //left and right ms
        Node righthead=mid.next;
        mid.next=null;
       Node newleft =MergeSort(head);
        Node newRight=MergeSort(righthead);
        //merge both
        return merge(newleft,newRight);
     }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

   

    public static void main(String[] args) {
        LL_MergeSort ll=new LL_MergeSort();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addFirst(50);
        ll.print();
        ll.head=ll.MergeSort(ll.head);
        ll.print();
    }
}
