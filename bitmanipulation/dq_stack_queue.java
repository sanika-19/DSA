import java.util.Deque;
import java.util.LinkedList;

public class dq_stack_queue {
    static class Queue {
        Deque<Integer> dq = new LinkedList<>();

        // add
        public void enqueue(int data) {
            dq.addLast(data);
        }

        // remove
        public int remove() {
            return dq.removeFirst();
        }

        //
        public int peek() {
            return dq.getFirst();
        }

    }

    // public static class Stack {
    // Deque<Integer> dq = new LinkedList<>();

    // // push
    // public void push(int data) {

    // dq.addLast(data);
    // }

    // // pop
    // public int pop() {
    // int val = dq.removeLast();
    // return val;
    // }

    // // peek
    // public int peek() {

    // return dq.getLast();
    // }
    // }
    public static void main(String[] args) {
        // Stack st=new Stack();
        // st.push(10);
        // st.push(20);
        // st.push(30);
        // st.push(40);
        // System.out.println(st.peek());;
        // System.out.println(st.pop());

        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Peek=" + q.peek());
        System.out.println(q.remove());

        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
