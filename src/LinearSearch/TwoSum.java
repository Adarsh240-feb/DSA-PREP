package LinearSearch;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {2  , 7 , 11 , 15};
        int target = 9;
        System.out.println(Arrays.toString(TwoSum(arr, target)));
    }
    static int[] TwoSum(int [] arr , int target){
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = i + 1; j < arr.length ; j++){
                if (arr[i] + arr[j] == target){
                    return new int[] {i + 1 , j + 1};
                }

            }
        }
        return new int[] {-1  -1};
    }
}
