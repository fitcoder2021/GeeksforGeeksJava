
import java.util.Scanner;



public class CalculaterbyMe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first no and secound No");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

//        System.out.println("choose the Operation you want to perfome (+,-,*,%");
        System.out.println("choose the operation you want to performe (+, -,*,/,%)-");

//        char op = scanner.nextInt(). charAt(0);
        char op = scanner.next().charAt(0);

        solve(a, b, op);
    }

    public static int solve(int a , int b , char op) {

        int ans = 0;

        if (op == '+') {
            ans = a + b;

        } else if (op == '-') {
            ans = a - b;
        } else if (op == '*') {

            ans = a * b;

        } else if (op == '%') {
            ans = a % b;

        }

        System.out.println("your answer is : " + ans);

        return ans;
    }}

