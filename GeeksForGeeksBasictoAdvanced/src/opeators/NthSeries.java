package opeators;



public class NthSeries {

    static int nthterms(int a , int d, int n )
    {
        return (a+(n-1)*d);

    }

    public static void main(String[] args) {
        int a = 2;
        int d = 1;
        int n = 5;
        System.out.println(n +nthterms(a,d,n));
    }
}
