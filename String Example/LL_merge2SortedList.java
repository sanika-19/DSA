public class LL_merge2SortedList {
    static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        
    }
    public  static Node Merge2(Node head1,Node head2){
        Node dummy=new Node(-1);
        Node temp=dummy;
        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
                temp.next=head1;
                temp=head1;
                head1=head1.next;
            }else{
                temp.next=head2;
                temp=head2;
                head2=head2.next;
            }
        }
       if(head1!=null){
        temp.next=head1;
       }else{
        temp.next=head2;
       }
       return dummy.next;
    }

    
    static void printList(Node head) {
    while (head != null) {
        System.out.print(head.data + " -> ");
        head = head.next;
    }
    System.out.println("null");
    }
    
    public static void main(String args[]){
       Node head1 = new Node(5);
        head1.next = new Node(10);
        head1.next.next = new Node(15);
        head1.next.next.next = new Node(40);

        Node head2 = new Node(2);
        head2.next = new Node(3);
        head2.next.next = new Node(20);

        Node res=Merge2(head1,head2);
        printList(res);
        
    }
}
