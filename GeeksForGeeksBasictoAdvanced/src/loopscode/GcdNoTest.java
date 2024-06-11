package loopscode;

import java.util.Scanner;

public class GcdNoTest {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter the secound no");
        int num2 = scanner.nextInt();

        int smaller = Math.min(num1, num2);
        ;

        int gcd = 1;

        for (int i = 1; i <= smaller; i++) {

            if (num1 % i == 0 && num2 % i == 0) {
                gcd = 1;
            }}
            System.out.println("the gcd" + num1 + "and " + num2 + "is gcd" + gcd);
            scanner.close();
        }

}



