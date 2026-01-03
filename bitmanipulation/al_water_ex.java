import java.util.ArrayList;

public class al_water_ex {
    // public static int water_Contain(ArrayList<Integer> ht){
    // int maxwater=0;
    // //Brutee Force
    // for(int i=0;i<ht.size();i++){
    // for(int j=i+1;j<ht.size();j++){
    // int height=Math.min(ht.get(i), ht.get(j));
    // int width=j-i;
    // int water=height*width;
    // maxwater=Math.max(maxwater, water);
    // }
    // }
    // return maxwater;
    // }

    // 2 Pointer Approch
    public static int water_Contain(ArrayList<Integer> ht) {
        int maxwater = 0;

        int lp = 0, rp = ht.size() - 1;
        while (lp < rp) {
            // water area
            int height = Math.min(ht.get(rp), ht.get(lp));
            int width = rp - lp;
            int water = height * width;
            maxwater = Math.max(maxwater, water);

            // update pointers
            if (ht.get(lp) < ht.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxwater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(water_Contain(height));

    }
}
