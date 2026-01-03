public class DoubleLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    // methods

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NUll");
    }

    // add
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    // Remove-first
    public int removeFirst() {
        if (head == null) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }

        // check Condition foer Only one Node
        if(size==1)
        {
        int val=head.data;
        head=tail=null;
        size--;
        return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;

    }
    //Remove -last

    public int RemoveLast(){
        if(head==null){
            System.out.println("LL Empty");
            return Integer.MIN_VALUE;
        }
        int val=tail.data;
        tail.prev.next=null;
        tail=tail.prev;
        size--;
        return val;
    }
    //Reverse DLL
    public void Reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
            
        }
        head=prev;
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(50);
        dll.addFirst(40);
        dll.addFirst(30);
        dll.addFirst(20);
        dll.addFirst(10);
        dll.print();
        dll.Reverse();;
        dll.print();
        // dll.removeFirst();
        // System.out.println(dll.RemoveLast()); 
        // dll.print();
        // System.out.println(dll.size);

    }
}
