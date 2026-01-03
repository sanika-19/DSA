public class LL_Zigzag {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;

    // method
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("LL is Empty");
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        if (temp == null) {
            System.out.println("LL is Empty");
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("Null");
    }
    // Method for finding mid

    public Node getmid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast!=null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // slow become our mid;
    }

    public void Zigzag() {
        // step-1 Find Mid
        Node mid = getmid(head);

        // step-2 Reverse send half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        // step-3 Alerternate Merging
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            // updation
            left = nextL;
            right = nextR;
        }

    }

    public static void main(String[] args) {
        LL_Zigzag ll = new LL_Zigzag();
        ll.addFirst(50);
        ll.addFirst(40);
        ll.addFirst(30);
        ll.addFirst(20);
        ll.addFirst(10);
        ll.print();
        ll.Zigzag();
        ll.print();
    }
}
