package MultidimensionalArrays_Arrays;

import java.util.Arrays;

public class maxval {
    public static void main(String[] args) {
        int [] arr = {1 , 34 , 56 , 7 , 89};
        System.out.println(Arrays.toString(arr));
        System.out.println(maxVal(arr));

    }
    static int maxVal(int [] arr){
        int max = arr[0];
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] > max){
                max = arr[i];
            }


        }
        return max;


    }


}
