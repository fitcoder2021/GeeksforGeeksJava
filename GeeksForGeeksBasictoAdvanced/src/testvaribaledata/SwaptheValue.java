package testvaribaledata;

public class SwaptheValue {

    static void swapValue(int m , int n){

        int temp = m ;
        m = n;
        temp= n;

        System.out.println("value of m :"+m + "value of n :"+n);

    }

    public static void main(String[] args) {
        int m = 9; int n = 5;

       swapValue(m,n);
    }

}
