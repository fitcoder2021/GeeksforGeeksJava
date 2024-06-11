package loopscode;

import java.util.Scanner;

public class LcmData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first no");
        int num1 = scanner.nextInt();

        System.out.println("Enter the secound no");
        int num2 = scanner.nextInt();

        int lcm = Math.max(num1,num2);

        for(int i = lcm; i<num1*num2; i += lcm){
            if(i%num1 ==0 && i%num2==0){

                lcm = 1;
                break;
            }

        }

        System.out.println("lcm" + num1 + "and" +num2 + "is" +lcm);
        scanner.close();

    }
}
