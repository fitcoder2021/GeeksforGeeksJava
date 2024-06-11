package javahungry;

import java.util.Arrays;
import java.util.List;

public class SortAllValue {
    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(10,20,40,50);

        ls.stream().sorted().forEach(System.out::println);
    }
}
