import java.util.ArrayList;

public class al_reverse {
   
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(10);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        //Print Reverse
        for(int i=l1.size()-1;i>=0;i--){
            System.out.print(l1.get(i)+" ");
        }
        
    }
}
