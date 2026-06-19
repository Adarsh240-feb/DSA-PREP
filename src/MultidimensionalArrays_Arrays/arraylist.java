package MultidimensionalArrays_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Give me length of list: ");
        int n = in.nextInt();
        System.out.print("GIve me elements:");
        for (int i = 0 ; i < n ; i++){
            list.add(in.nextInt());

        }
        System.out.println(list);


    }
}
