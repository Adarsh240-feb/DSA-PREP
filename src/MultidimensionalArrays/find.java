package MultidimensionalArrays;

import java.util.Scanner;

public class find {
    public static void main() {
        int [] arr = {1 , 5 , 67 , 89 , 2};
        Scanner in = new Scanner(System.in);
        int numtoFind = in.nextInt();

        for (int i = 0 ; i < arr.length ; i++){
            int num ;
            if (arr[i] == numtoFind){
                num = arr[i];
                System.out.println( num + " is in array");
                return;
            }

        }
        System.out.println(numtoFind + " NOT FOUND IN ARRAY");

    }
}
