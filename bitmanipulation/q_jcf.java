import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class q_jcf {

     public static void main(String[] args) {
    //    Queue <Integer>q=new LinkedList<>() ;
       Queue q=new ArrayDeque<>();
        q.add(10);
        q.add(2);
        q.add(20);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
           q.remove();
        }
        
        
    }
}
