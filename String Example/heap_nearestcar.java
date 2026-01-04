import java.util.PriorityQueue;

public class heap_nearestcar {
    static class Point implements Comparable<Point>{
        int x,y,distp,idx;
        public Point(int x,int y,int distp,int idx){
            this.x=x;
            this.y=y;
            this.distp=distp;
            this.idx=idx;
        }
        @Override
        public int compareTo(Point p2) {
            // TODO Auto-generated method stub
            return this.distp-p2.distp; //Sorting Based on ascending order
            // throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
        }
    }
    public static void main(String[] args) {
        int point[][]={{3,3},{5,-1},{-2,4}};
        int k=2;
       PriorityQueue<Point> pq=new PriorityQueue<>();
       for(int i=0;i<point.length;i++){
        int distsq=point[i][0]*point[i][0]+point[i][1]*point[i][1];
        pq.add(new Point(point[i][0],point[i][1],distsq ,i));

       }
       //nearest k  car
       for(int i=0;i<k;i++){
        System.out.println("C"+pq.remove().idx);
       }
    }
}
