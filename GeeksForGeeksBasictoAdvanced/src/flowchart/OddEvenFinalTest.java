package flowchart;

import java.util.Scanner;

public class OddEvenFinalTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if(n%2==0){
            System.out.println("Even no");
        }
        else{
            System.out.println("Odd no ");
        }
    }
}
