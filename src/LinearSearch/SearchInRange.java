package LinearSearch;

import java.util.Scanner;

public class SearchInRange {
    public static void main() {
        int [] nums = { 34 , 67 , 56 , 43 , 79 , 41};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Start Index:");
        int start = in.nextInt();
        System.out.print("Enter the end Index:");
        int end = in.nextInt();
        System.out.print("Enter the target:");
        int target = in.nextInt();
        System.out.println(SearchInR(nums , start , end , target));

    }
    static boolean SearchInR(int [] arr , int start , int end , int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int i = start ; i < end ; i++){
            if (arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
