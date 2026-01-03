import java.util.Comparator;
import java.util.PriorityQueue;

class Pq_operation{
public static void main(String[] args) {
    PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
    pq.add(10);
    pq.add(20);
    pq.add(30);
    pq.add(50);
    pq.add(40);
    pq.remove();
    System.out.println(pq);
}
}
