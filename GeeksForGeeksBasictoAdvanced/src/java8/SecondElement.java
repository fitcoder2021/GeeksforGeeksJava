package java8;

import java.util.Arrays;
import java.util.List;

public class SecondElement {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(20,30,50,60);
        ls.stream()
                .skip(2)
                .findAny()
                .ifPresent(System.out::println);

    }
}
