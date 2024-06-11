package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TotalNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50);

        long count = list.stream()
                .count();
      System.out.println(count);
    }
}
