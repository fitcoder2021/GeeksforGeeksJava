package flowchart;

import java.util.Scanner;

public class OddTest {
    public static void utility(int number){

            if (number % 2 == 0) {
                System.out.println("Friend");
            } else {
                System.out.println("You");
            }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){

            int number = scanner.nextInt();
            utility(number);
            System.out.println();

        }
        scanner.close();
    }
}
