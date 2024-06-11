package opeators;

public class LastDigit {

    static int lastdigit(int n){
        return (n%10);
    }

    public static void main(String[] args) {
        int n = 12345;

        System.out.println(lastdigit(Math.abs(n)));
    }
}
