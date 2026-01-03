import java.util.ArrayList;

public class heap_insert {
    static class heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // add at last index
            arr.add(data);
            int x = arr.size() - 1; // x is child index;
            int par = (x - 1) / 2; // Parent index
            while (x > 0 && arr.get(x) < arr.get(par)) {

                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                x = par;
                par = (x - 1) / 2;
            }

        }

        private void heapify(int i) {
            int left = (2 * i) + 1;
            int right = (2 * i) + 2;
            int minidx = i;

            if (left < arr.size() && arr.get(left) < arr.get(minidx)) {
                minidx = left;
            }

            if (right < arr.size() && arr.get(right) < arr.get(minidx)) {
                minidx = right;
            }

            if (minidx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(minidx));
                arr.set(minidx, temp);
                heapify(minidx);
            }
        }

        public int peek() {
            if (arr.size() == 0) {
                throw new RuntimeException("Heap is empty");
            }

            return arr.get(0);
        }

        public boolean isEmpty() {
            // TODO Auto-generated method stub
            return arr.size() == 0;

        }

        public int remove() {
            // TODO Auto-generated method stub

            int data = arr.get(0);
            // step 1 swap first and last node
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // step 2 delete last
            arr.remove(arr.size() - 1);

            // heapify
            heapify(0);
            return data;
        }
    }

    public static void main(String[] args) {
        heap hp = new heap();
        hp.add(3);
        hp.add(4);
        hp.add(1);
        hp.add(5);
        while (!hp.isEmpty()) {
            System.out.println(hp.peek());
            hp.remove();
        }
    }
}
