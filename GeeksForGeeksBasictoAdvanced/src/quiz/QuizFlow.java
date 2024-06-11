package quiz;

public class QuizFlow {
    public static void main(String[] args) {

        int number = 100;

        if(number%2==0){
            System.out.println("First");
        }
        else if (number%4==0) {
            System.out.println("Secound");
        }
        if(number%5==0){
            System.out.println("Third");
        }
        else {
            System.out.println("fourth");
        }
        System.out.println();

        }
    }
