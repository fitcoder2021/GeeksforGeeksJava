package javahungry;

import java.util.Arrays;
import java.util.List;

public class FIndoutAllevenno {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(10,20,30,40,42,34,47);

        ls.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
