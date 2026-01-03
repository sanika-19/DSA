public class Search_in_Rotated_Array {
    public static int search_arr(int arr[], int tar, int si, int ei) {
        if(si>ei){
            return -1;
        }
        // kammm
        int mid = si + (ei - si) / 2;
        // Case Found
        if (arr[mid] == tar) {
            return mid;
        }
        // mid on l1
        if (arr[si] <= arr[mid]) {
            // case: left
            if (arr[si] >= tar && tar <= arr[mid]) {
                return search_arr(arr, tar, si, mid-1);
            } else {
                return search_arr(arr, tar, mid + 1, ei);
            }
        }
        // mid lie on l2
        else {
       if(arr[mid]<=tar && tar<=arr[ei]){
        return search_arr(arr, tar, mid+1, ei);
       }
       else{
        return search_arr(arr, tar, si, mid-1);
       }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 1;// Output->4;
        int taridx = search_arr(arr, target, 0, arr.length - 1);
        System.out.println(taridx);
    }
}
