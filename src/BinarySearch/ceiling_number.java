package BinarySearch;

import java.util.Scanner;

public class ceiling_number {
    public static void main() {
        int [] arr = {1 , 45 , 67 , 89 , 90 , 93};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter target to search :");
        int target = in.nextInt();
        int ans = ceiling(arr , target);
        System.out.println(ans);

    }
    static int ceiling (int [] arr , int target){
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
        return start; // or return arr[start]; but it cause outofbound error

    }

}


