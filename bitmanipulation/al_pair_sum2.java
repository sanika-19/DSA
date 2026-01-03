import java.util.ArrayList;

class al_pair_sum2 {
    public static boolean find_pair_sum(ArrayList<Integer> l, int target) {
        int bp = -1, n = l.size();
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) > l.get(i + 1)) {// breaking point
                bp = i;
                break;
            }
        }
        int lp = bp + 1;// smallest ele
        int rp = bp;// largest ele
        while (lp != rp) {
            if (l.get(lp) + l.get(rp) == target) {
                return true;
            }
            if (l.get(lp) + l.get(rp) < target) {
                lp = (lp + 1) % n;
            } 
            else {
                rp = (n + rp - 1) % n;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(find_pair_sum(list, 160));
    }
}
