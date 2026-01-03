import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class grd_job_seq {
    static class Job{
        int deadline;
        int profit;
        int id;//0,1,2,3...
        public Job(int i,int d,int p){
            id=i;
            deadline=d;
            profit=p;
        }
    }
    public static void main(String[] args) {
        int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList <Job> jobs=new ArrayList<>();
        for(int i=0;i<jobInfo.length;i++){
           jobs.add(new Job(i,jobInfo[i][0],jobInfo[i][1]));
        }
        Collections.sort(jobs,(obj1,obj2) -> obj2.profit-obj1.profit);
        //sort based on decending order of profit
       int time=0;
        ArrayList<Integer> seq=new ArrayList<>();
        for(int i=0;i<jobs.size();i++){
           Job curr=jobs.get(i);
           if(curr.deadline>time){
            seq.add(curr.id);
            time++;
           }
        }
        //print sequence
        System.out.println("Max Job:"+seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
}
