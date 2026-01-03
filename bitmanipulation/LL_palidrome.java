public class LL_palidrome {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // methods
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    //Slow-fast approch
    private Node findmid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
           slow=slow.next;//+1
           fast=fast.next.next;//+2
        }
        return slow; //slow is my mid
    }
    public boolean CheckPalindrome(){
        //base case
        if(head== null || head.next==null){
            return true;
        }
        //Step-1 Find Mid
        Node midNode=findmid(head);

        //Step-2 Reverse 2nd half 
        Node curr=midNode;
        Node prev=null;
         Node next;
        if(curr!=null){
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
        }
        Node right=prev;
        Node left=head;//right half head

        //Step-3 check left half and right half
        while(right!=null){
            if(left.data==right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

    }


    public static void main(String[] args) {
        LL_palidrome ll = new LL_palidrome();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
         ll.addFirst(2);
        ll.print();
        System.out.println(ll.CheckPalindrome());
    }
}
