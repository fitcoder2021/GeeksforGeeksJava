package loopscode;

public class TestingCountDigit {

    public static int countDigit( long n){

        int count = 0;

        while (n!= 0){
            n = n/10;
            ++count;
        }
        return count++;
    }

    public static void main(String[] args) {
        long n = 1288820;

        System.out.println(countDigit(n));
    }
}
