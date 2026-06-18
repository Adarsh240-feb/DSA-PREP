package Functions;

import java.util.Scanner;

public class sum {
    public static void main() {
        sum();


    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Num 1 :");
        int num1 = in.nextInt();
        System.out.println("Enter Num 2 :");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum is :" +sum);


    }
}
