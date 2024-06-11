package testvaribaledata;



public class TestingData {
    static  int a = 12;
    private int b = 22;

    public void method1(int a ) {
        TestingData t = new TestingData();

        this.a = 22;
        b = 44;


        System.out.println("Test. a :" + this.a);
        System.out.println("t.b:" + t.a);
        System.out.println("t.b:" + b);
        System.out.println("a:" + b);

    }

    public static void main(String[] args) {

            TestingData t = new TestingData();
            t.method1(5);

    }

    }

