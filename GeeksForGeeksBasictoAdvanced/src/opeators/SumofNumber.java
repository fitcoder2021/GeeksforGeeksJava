package opeators;

public class SumofNumber {

    static int sumdata(int n){

        int sum = 0;
        for(int x = 1; x<=n;x++)
            sum = sum+x;

        return sum;

    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(sumdata(n));
    }
}
