package flowchart;

import java.util.Optional;

public class ReturnTest {
    public static void main(String[] args) {

        boolean t = true;

        System.out.println("before the return");
        if (t)
            return;
       System.out.println("this wont be excuted ");
    }
}
