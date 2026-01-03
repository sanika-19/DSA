public class st_LinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node tail;

    public static class Stack {

        public static Node head = null;

        // push
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // isempty
        public static boolean isEmpty() {
            return head == null;
        }

        // pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            int val = head.data;
            return val;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(50);
        st.push(40);
        st.push(30);
        st.push(20);
        st.push(10);
        while (!st.isEmpty()) {
            System.out.print(st.peek() + " ");
            System.out.println(st.pop());
        }
    }
}
