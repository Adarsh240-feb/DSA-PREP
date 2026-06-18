package LinearSearch;

import java.util.Scanner;

public class Frist {
    public static void main() {
        int [] nums = {1 , 34, 67 , 5 , 69};
        Scanner in = new Scanner (System.in);
        int target = in.nextInt();
        int ans = LinearSearch(nums , target);
        System.out.println(ans);



    }
    static int LinearSearch(int [] arr , int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == target){
                int element = target;
                return i;

            }
        }
        return -1;


    }
}
