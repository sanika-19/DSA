public class LL_DetectCycle {
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
    // public void addFirst(int data){
    //     Node newNode=new Node(data);
    //     if(head==null){
    //         head=tail=newNode;
    //         return;
    //     }
    //     newNode.next=head;
    //     head=newNode;
    // }
    public  static void print(){
        Node temp=head;
        if(head==null){
            System.out.println("LL Empty");
            
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public  static boolean check_Cycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public  static void removeCycle(){
        int exist=0;
        //Detect cycle
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                exist=1;
                break;
            }
            if(exist==0){
               return; 
            }
            
        }
        //find meeting Point
        slow=head;
        Node prev=null; //last node
        while (slow!=fast) {
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }

        //Remove cycle->last.next=null
        prev.next=null;
    }
    public static void main(String[] args) {
        
        // LL_DetectCycle ll=new LL_DetectCycle();
       head=new Node(1);
       Node temp=new Node(2);
       head.next=temp;
       head.next.next=temp;

    //    head.next.next.next=temp;
       
        // ll.addFirst(50);
        // ll.addFirst(40);
        // ll.addFirst(30);
        // ll.addFirst(20);
        // ll.addFirst(10);
        // ll.addFirst(head);
        //  print();
         System.out.println(check_Cycle());
         removeCycle();
         System.out.println(check_Cycle());
    }
}
