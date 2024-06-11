package GfgoutputExample;

import java.util.Scanner;

public class TestingScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        char gender = scanner.next().charAt(0);

        int age = scanner.nextInt();

        long mobileNumber = scanner.nextLong();



        double cgpa = scanner.nextDouble();

        System.out.println("name :"+ name);
        System.out.println("gender :"+ gender);
        System.out.println("age :"+ age);
        System.out.println("mobileNumber :"+ mobileNumber);
        System.out.println("cgpa:"+cgpa);









    }
}
