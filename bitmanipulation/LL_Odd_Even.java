public class LL_Odd_Even {
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
    public static int size=0;
    //addFirst
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //print 
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    public void arrange(){
        Node temp=head;
        while(temp!=null){
            if(temp.data%2==0){
                temp=temp.next;
            }
           
        }
    }

    public static void main(String[] args) {
        LL_Odd_Even ll=new LL_Odd_Even();
        ll.addFirst(6);
        ll.addFirst(1);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(10);
        ll.addFirst(12);
        ll.addFirst(8);
        ll.print();;
        ll.arrange();
        
    }
}
