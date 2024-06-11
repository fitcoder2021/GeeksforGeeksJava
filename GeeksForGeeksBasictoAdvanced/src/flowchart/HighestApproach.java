package flowchart;

import java.util.Scanner;

public class HighestApproach {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int b = scanner.nextInt();

        int c = scanner.nextInt();

        int ans1 = Math.max(a,b);

        ans1 = Math.max(ans1, c);
        System.out.println(ans1);


    }
}
