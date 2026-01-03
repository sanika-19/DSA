import java.util.Comparator;
import java.util.PriorityQueue;
import java.lang.Comparable;;

public class pq_object {
     static class Student implements Comparable<Student>{
        String nm;
        int rank;
        public Student(String nm,int rank){
            this.nm=nm;
            this.rank=rank;

        }
       
        @Override
        public int compareTo(Student obj) {
            // TODO Auto-generated method stub
            return this.rank-obj.rank;
        }

    }
    public static void main(String[] args) {
        PriorityQueue<Student>pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("Sanika", 5));
        pq.add(new Student("Krani", 1));
        pq.add(new Student("Ayush", 10));
        pq.add(new Student("Sanket", 2));

     while (!pq.isEmpty()) {
        System.out.println(pq.peek().nm+"->"+pq.peek().rank);
        pq.remove();
     }
    }
}
