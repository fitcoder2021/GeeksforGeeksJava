package loopscode;

import java.util.Scanner;

public class AllDivisior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter is first no");
        int num= scanner.nextInt();

        int i = 1;
        System.out.println("the divisors of " + num + "are is :");

        while (i <= num){
            if(num % i ==0){
                System.out.println(i + "");
            }
            i++;

        }
        scanner.close();

    }
}
