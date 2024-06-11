package opeators;

import java.util.Scanner;

public class AndTesting {
    public static void main(String[] args) {

        String s = "geek", t = "Geek";

        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.next();
        String t1 = scanner.next();

        if(s.equals(s1) && t.equals(t1))
            System.out.println("Welcome");
        else
            System.out.println("Try again ");


}}

