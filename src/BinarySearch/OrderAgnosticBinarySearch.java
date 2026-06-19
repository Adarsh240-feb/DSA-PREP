package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 45, 67, 89, 90, 93};
        int target = 1;
        int ans = orderagnostic(arr, target);
        System.out.println("Target found at index: " + ans); // Expected output: 0
    }

    static int orderagnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
}