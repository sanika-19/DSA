import java.util.ArrayList;

public class al_pairsum {
    public static boolean find_pair(ArrayList<Integer>arr,int target){
        int lp=0,rp=arr.size()-1;
        while (lp!=rp) {
            //case 1
            if(arr.get(lp)+arr.get(rp)==target){
                return true;
            }
            //case 2
            else if(arr.get(lp)+arr.get(rp)<target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
//Brute Force
    //   public static boolean find_pair(ArrayList<Integer>arr,int target){
    //     ArrayList<Integer>ans=new ArrayList<>();
    //    for(int i=0;i<arr.size();i++){
    //     for(int j=i+1;j<arr.size();j++){
    //         if(arr.get(i)+arr.get(j)==target){
                
    //             return true;
    //         }
    //     }
    //    }
    //    return false;
    // }
    public static void main(String[] args) {
       ArrayList<Integer>arr=new ArrayList<>();
       arr.add(1) ;  arr.add(2) ;  arr.add(3) ;arr.add(4) ;  arr.add(5) ;  arr.add(6) ;
      System.out.println( find_pair(arr,30));

    }
}
