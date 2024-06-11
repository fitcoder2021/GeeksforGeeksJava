package flowchart;

import java.util.Scanner;

public class Geometrical {
    public static void main(String[] args) {
        int x = 0, y = 0;

        System.out.println("Enter a move");

        Scanner scanner = new Scanner(System.in);
        char move = scanner.next().charAt(0);

        switch (move){
            case 'l':
                x--;
                break;

            case 'R':
                x++;
                break;

            case 'v':
                y--;
                break;
            case 'D':
                y++;
                break;

        }
    }
}
