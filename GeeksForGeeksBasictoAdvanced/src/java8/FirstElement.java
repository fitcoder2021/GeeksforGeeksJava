package java8;

import java.util.Arrays;
import java.util.List;

public class FirstElement {
    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(10,20,30,40,50);

        ls.stream()
                .findFirst()
                .ifPresent(System.out::println);

    }
}
