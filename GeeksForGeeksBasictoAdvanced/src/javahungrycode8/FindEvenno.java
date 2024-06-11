package javahungrycode8;

import java.util.Arrays;
import java.util.List;

public class FindEvenno {

    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(10,30,28,40,47);

        ls.stream().filter(n->n%2 ==0).forEach(System.out::println);
    }
}
