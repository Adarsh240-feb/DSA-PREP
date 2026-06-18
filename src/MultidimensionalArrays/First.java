package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class First {
    public static void main() {
        int [][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
        int length = arr.length;

        for (int r = 0 ; r < length ; r++){
            for (int c = 0 ; c < arr[r].length; c++){
                arr[r][c] = in.nextInt();
            }

        }
        for (int r = 0 ; r <length ; r++){
            for (int c = 0 ; c < arr[r].length; c++){
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int r = 0 ; r <length ; r++){
            System.out.println(Arrays.toString(arr[r]));
        }

        System.out.println();

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }




    }
}
