package BinarySearch;

public class First {
    public static void main() {
        int [] arr = {1 , 45 , 67 , 89 , 90 , 93};
        int target = 90;
        int ans = BinarySearch(arr , target);
        System.out.println(ans);
    }

    static int BinarySearch (int [] arr , int target){
        int start = 0;
        int end = arr.length - 1;

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
