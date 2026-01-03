public class LL_Search {
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
    public  static int size;

    //methods
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            System.out.println("LL is Empty!!");
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
           System.out.print(temp.data+"->");
           temp=temp.next;
        }
        System.out.println("Null");
    }
    public void Reverse_LL(){
        Node curr=tail=head;
        Node prev=null;
        Node next;
       
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        
    }
    public void deletenthFrom_last(int n){
       int sz=0;
       Node temp=head;
       while (temp!=null) {
        temp=temp.next;
        sz++;
       }
       if(n==sz){
        head=head.next;//remove first op
        return;
       }
       //sz-n
       int i=1;
       int idxTofind=sz-n;
       Node prev=head;
       while (i<idxTofind) {
        prev=prev.next;
         i++;
       }
       prev.next=prev.next.next;
       return;
    }
   
    public static void main(String[] args) {
        LL_Search ll=new LL_Search();
       ll. addFirst(50);
       ll.addFirst(40);
       ll.addFirst(30);
       ll.addFirst(20);
        ll.addFirst(10);
        ll.print();
        // ll.deletenthFrom_last(3);
       ll.deletenthFrom_last(3);
        ll.print();
    }
    
}
