package loopscode;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TimeTest {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        long startTime;
        long endTime;

        for(int i = 0; i<1000000; i++){
           list.add(i);

        }
        startTime = Calendar.getInstance().getTimeInMillis();
        for(int i : list){

            int a = i;
        }

        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("for Each loops ::"+ (endTime-startTime)+ "ms");

    }
}
