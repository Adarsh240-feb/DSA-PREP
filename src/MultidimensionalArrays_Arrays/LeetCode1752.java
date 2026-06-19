//Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
//
//There may be duplicates in the original array.
//
//Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.




package MultidimensionalArrays_Arrays;

public class LeetCode1752 {
    public static void main(String[] args) {
        int [] arr = {4 , 3 , 1 , 5 , 2};
        boolean ans = compare(arr);
        System.out.println(ans);



    }
    static boolean compare(int [] arr){
        int count = 0;
        int n = arr.length;

        for (int i = 0 ; i < n ; i++){
            if (arr[i] < arr[(i+1)%n]){
                return true;

            }
            else if (arr[i] > arr[(i+1) % n]){
                count++;
            }

            if (count > 1){
                return false;
            }
        }
        return true;
    }
}
