package flowchart;

import java.util.Scanner;

public class Largest3No {
    public static void main(String[] args) {
//        int a = 10, b =20, c= 35;

        Scanner scanner = new Scanner(System.in);

      int   a = scanner.nextInt();
      int   b= scanner.nextInt();
       int  c=scanner.nextInt();

        if(a>=b && b>=c){
            System.out.println(a);
        }
        else if (b>=a && b>=c){

            System.out.println(b);
        } else if(c>=b && c>=b)
        {
            System.out.println(c);
        }

    }
}
