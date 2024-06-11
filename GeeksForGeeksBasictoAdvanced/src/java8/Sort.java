package java8;

import java.util.Arrays;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(20,30,8,9,33);
        ls.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
