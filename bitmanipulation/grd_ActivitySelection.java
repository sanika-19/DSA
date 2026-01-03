import java.util.ArrayList;
import java.util.*;

public class grd_ActivitySelection {

    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        //Sorting

    int activities[][]=new int[start.length][3];
    for(int i=0;i<start.length;i++){
        activities[i][0]=i;
        activities[i][1]=start[i];
        activities[1][2]=end[i];
        //Sort Lambda Function
        Arrays.sort(activities,Comparator.comparingDouble(o ->o[2]));
    }
        //end time basis sorted Activity
         int max_Act=0;
     ArrayList ans=new ArrayList<>();
     max_Act=1;
     ans.add(0);
     int LastEnd=end[0];
       for(int i=0;i<end.length;i++){
        if(start[i]>=LastEnd){
            max_Act++;
            ans.add(i);
            LastEnd=end[i];
        }

       }
       System.out.println("MaxActivity="+max_Act);
       for(int i=0;i<ans.size();i++){
        System.out.print("A"+ans.get(i)+" ");
       }
    }
}
