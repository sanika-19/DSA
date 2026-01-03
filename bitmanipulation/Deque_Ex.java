import java.util.Deque;
import java.util.LinkedList;
public class Deque_Ex {
    public static void main(String[] args) {
        Deque<Integer>dq=new LinkedList<>();
        dq.addFirst(10);
        dq.addFirst(20);
        dq.addFirst(30);
        dq.addLast(40);
        System.out.println(dq);
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);
    }
}
