package opeators;

public class Nthtesting {
    static int nthseriestest(int a, int r, int n){

        return (a*(int)(Math.pow(r,n-1)));

    }

    public static void main(String[] args) {
        int a = 2;
        int r = 5;
        int n = 10;

        System.out.println(nthseriestest(a,r,n));
    }
}
