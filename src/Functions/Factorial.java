package Functions;

import java.util.Scanner;

public class Factorial {
    public static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number for the factorial:");
        int n = in.nextInt();
        int ans = Factorial(n);
        System.out.println(ans);


    }
    static int Factorial(int n){
        if (n <= 0){
            return -1;
        }
        int result = 1;
        for (int i = 1; i<=n ;i++){
            result = result *i;
        }
        return result;
    }
}

