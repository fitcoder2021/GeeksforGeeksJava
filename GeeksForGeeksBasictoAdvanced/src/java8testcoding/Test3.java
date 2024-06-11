package java8testcoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {

        List<Integer> evens = Arrays.asList(2,4,6);
        List<Integer> oods = Arrays.asList(3,5,7);
        List<Integer> primes = Arrays.asList(2,3,5,7,9,11);

        List<Integer> numbers = Stream.of(evens,oods,primes)
                .flatMap(list-> list.stream())
                .collect(Collectors.toList());
        System.out.println(numbers);

    }
}
