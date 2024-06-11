package javahungry;

import java.util.Arrays;
import java.util.List;

public class TotalNo {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(10,20,20,30,50);

        long count = ls.stream().count();

        System.out.println(count);

    }
}
