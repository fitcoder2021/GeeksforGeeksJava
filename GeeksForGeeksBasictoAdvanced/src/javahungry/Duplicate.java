package javahungry;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(10,10,12,12,15,18,20);

        Set<Integer> hs = new HashSet<>();

        ls.stream().filter(n ->!hs.add(n))
                .forEach(System.out::println);
    }
}
