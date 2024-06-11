package javahungry;

import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(11,13,15,60,50);

        ls.stream()
                .map(s->s +"")
                .filter(s->s.startsWith("1"))
                .forEach(System.out::println);
    }
}
