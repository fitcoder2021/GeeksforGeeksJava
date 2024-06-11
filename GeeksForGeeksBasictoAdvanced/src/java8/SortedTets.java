package java8;

import java.util.Arrays;
import java.util.List;

public class SortedTets {
    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(10,30,40,50,60,70);
        ls.stream().sorted().forEach(System.out::println);
    }
}
