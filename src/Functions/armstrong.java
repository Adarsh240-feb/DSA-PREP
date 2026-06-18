package Functions;

import java.util.Scanner;

public class armstrong {
    public static void main() {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        boolean ans = isArmstrong(n);
//        System.out.println(ans);

        for (int i = 1000 ; i <10000 ; i++){
            if(isArmstrong(i)){
                System.out.print(i+ " ");
            }
        }
    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while (n>0){
            int rem = n % 10;
            n = n/ 10;
            sum += rem*rem*rem*rem;
        }
        return sum ==original;


    }
}
