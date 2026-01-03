public class LL1 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
            System.out.println("Node ready");
        }
    }
    public static Node head;
    public static Node tail;
    //methods for add(),remove(),print(),search()
    public void addFirst(int data){
      Node newNode=new Node(data);

        if(head==null){
            head=tail=newNode;
            return;
        }
        //step 1
        // Node newNode=new Node(data);
        //step 2 newnode.next=head;
        newNode.next=head;//link to the next node
        //step 3 
       
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
      
        tail.next=newNode;
        tail=newNode;
    }
    public void printLinkedList(){
        Node temp=head;
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        while(temp!=null){
        System.out.print(temp.data+" ->");
        temp=temp.next;
        }
        System.out.println("null");
    }

    
    public static void main(String[] args) {
        LL1 ll=new LL1();
        ll.addFirst(2);
        ll.printLinkedList();
        ll.addFirst(1);
        ll.printLinkedList();
        ll.addLast(3);
        ll.printLinkedList();
        ll.addLast(4);
        ll.printLinkedList();
        
    }
}
