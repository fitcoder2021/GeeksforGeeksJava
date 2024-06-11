package loopscode;

import java.util.Scanner;

public class FibonaciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the fibonaci series");
        int n = scanner.nextInt();

        int a = 0, b= 1;

        if(n==1){
            System.out.println(a);
        } else if (n==2) {
            System.out.println(a+ " "+b);
        }
        else {
            System.out.println(a+ " "+ b+"");
            for(int i = 3; i<=n; i++){

                int c = a+b;
                System.out.println(c+ "");

                a=b;
                b=c;
            }

        }
        scanner.close();
    }
}
