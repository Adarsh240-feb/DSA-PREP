package LinearSearch;

public class MaxWealth {
    public static void main(String[] args) {
        int [][] arr = new int[][]{
                {5 , 7},
                {6 , 9},
                {9 , 1}
        };
        int ans = Max(arr);
        System.out.println(ans);


    }
    static int Max(int [][] arr){
        int ans = Integer.MIN_VALUE;
        for (int i = 0 ; i < arr.length ; i++){
            int sum = 0;
            for (int j = 0 ; j < arr[i].length ; j++){
                sum += arr[i][j];
            }
            if (sum > ans){
                ans = sum;
            }

        }
        return ans;
    }
}
