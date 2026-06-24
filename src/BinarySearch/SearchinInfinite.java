package BinarySearch;

public class SearchinInfinite {
    public static void main() {
        int [] arr = {1 , 45 , 67 , 89 , 90 , 93};
        int target = 1;
        System.out.println(ans(arr , target));
    }
    static int ans(int [] arr , int target){
        int start = 0;
        int end = 1;

        while (target > arr[end]){
            int temp = end + 1;
            // end = previousend + sizeofbox * 2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarysearch(arr , target , start , end);
    }

    static int binarysearch(int[] arr , int target , int start , int end){
        while (start <= end){
            int mid = start + (end - start) / 2; //optimized formula to prevent for limit exceeding

            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid] ){
                start = mid + 1;
            }
            else {
                //ans found
                return mid;
            }
        }
        return -1;

    }
}

