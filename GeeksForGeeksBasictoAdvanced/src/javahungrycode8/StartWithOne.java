package javahungrycode8;

import java.util.Arrays;
import java.util.List;

public class StartWithOne {

    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(10,20,40,70);

        ls.stream().map(s->s+"")
                .filter(s->s.startsWith("1")).forEach(System.out::println);



    }
}
