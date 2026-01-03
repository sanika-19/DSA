public class q_LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue {
        public static Node head=null;
        public static Node tail=null;



        public static boolean isEmpty(){
            return head==null & tail==null;
        }
    

    public void add(int data) {
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static int remove() {
        if(isEmpty()){
          System.out.println("Queue is Empty");
          return -1;
        }
        int front = head.data;
        //single Element
        if(tail==head){
            tail=head=null;
        }
        else{
        head = head.next;
        }
        return front;
    }
    public static int peek() {
    if(isEmpty()){
          System.out.println("Queue is Empty");
          return -1;
        }
        return head.data;
    }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(10);
        q.add(2);
        q.add(20);
        while (q.head!=null) {
            System.out.println(q.peek());
           q.remove();
        }
        
        
    }
}
