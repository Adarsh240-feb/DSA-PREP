package Conditionals;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);


            System.out.println("give the operation to perform:");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){

                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(op == '+') {
                    System.out.println(num1 + num2);
                }
                if(op == '-') {
                    System.out.println(num1 - num2);
                }
                if(op == '*') {
                    System.out.println(num1 * num2);
                }
                if(op == '/') {
                    System.out.println(num1 / num2);
                }
                if(op == '%') {
                    System.out.println(num1 % num2);
                }

            }
            else{
                System.out.println("Invalid Operation");
            }



    }
}
