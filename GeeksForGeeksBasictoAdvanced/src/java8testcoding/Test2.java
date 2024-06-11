package java8testcoding;

import java.util.Arrays;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(45,66,78,90,78,90);

        ls.stream().filter(i->i % 5==0).forEach(System.out::println);

    }
}
