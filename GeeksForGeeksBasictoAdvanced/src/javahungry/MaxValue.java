package javahungry;

import java.util.Arrays;
import java.util.List;

public class MaxValue {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(10,20,30,50,80);

        int max = ls.stream().max(Integer::compare)
                .get();
        System.out.println(max);

    }
}
