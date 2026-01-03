import java.util.Arrays;
import java.util.Comparator;

public class grd_fractional_knapscak {

    public static void main(String[] args) {
        int weight[]={4,5,1};
        int val[]={1,2,3};
        int w=50;
       
        double ratio[][]=new double[val.length][2];
        //0th original index;
        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
        }
       
        //asceding order sort
       Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
       int  cap=w;
       int finalval=0;
       for(int i=ratio.length-1;i>=1;i--){
         int idx=(int)ratio[i][0];
         
         if(cap>=weight[idx]){//include full item
            finalval+=val[idx];
            cap-=weight[idx];
         }else{
            //include fractional item
            finalval+=(ratio[i][1]*cap);
            cap=0;
            break;
         }
       }
       System.out.println("Final val="+finalval);
    }
}
