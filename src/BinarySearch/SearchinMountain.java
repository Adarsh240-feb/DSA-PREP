package BinarySearch;

public class SearchinMountain {
    public static void main() {
        int [] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(search(arr,target));

    }
    static int search(int[] arr, int target){
        int peak = PeakIndex(arr);

        if (peak > target){
            return orderagnostic(arr ,target , 0 , peak);
        }
        else if(peak < target) {
            return orderagnostic(arr,target,peak + 1, arr.length - 1) ;

        }
        else {
            return -1;
        }

    }
    static int orderagnostic(int[] arr, int target ,int start , int end) {


        // Check if the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 1. Check if the element is found at mid
            if (arr[mid] == target) {
                return mid; // Return the index, not the target value
            }

            // 2. Adjust search space based on sorting order
            if (isAsc) {
                if (target < arr[mid]) { // Compare with arr[mid], not mid
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) { // For descending, bigger numbers are on the left
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1; // Target not found
    }

    static int PeakIndex(int []arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;

            } else {
                start = mid + 1;
            }
        }
        return start;
    }

}
