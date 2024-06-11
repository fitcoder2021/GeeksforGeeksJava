package flowchart;

import java.util.Scanner;

public class OddEvenTestByScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 4;

        if(n%2==0){
            System.out.println("Opponenet");
        }
        else {
            System.out.println("You");
        }
    }
}
