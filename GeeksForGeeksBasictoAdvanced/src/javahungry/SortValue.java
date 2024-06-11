package javahungry;

import java.util.Arrays;
import java.util.List;

public class SortValue {
    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(10, 30, 40, 50, 60);

        ls.stream().sorted().forEach(System.out::println);
    }
}