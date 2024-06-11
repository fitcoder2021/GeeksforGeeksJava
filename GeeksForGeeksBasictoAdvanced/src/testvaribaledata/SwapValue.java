package testvaribaledata;

public class SwapValue {

    static void swapdatausingThirdValue(int x ,int y ){

        int temp = x ;
        x = y;
        y= temp;

        System.out.println("value of x :" + x +  "value of y is :" + y);

    }

    public static void main(String[] args) {

        int x = 10 ,  y = 20;
        swapdatausingThirdValue(x,y);


    }

}
