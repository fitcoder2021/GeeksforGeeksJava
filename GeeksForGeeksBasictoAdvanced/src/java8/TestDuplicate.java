package java8;

import java.util.Arrays;

import java.util.List;

import java.util.stream.Collectors;

public class TestDuplicate {
    public static void main(String[] args) {
        List<String> ls= Arrays.asList("samar","ahmad","Google","Google");

//        Set<String> st = new HashSet<>();
//        ls.stream()
//                .filter(n->!st.add(n))
//                .forEach(System.out::println);

        List<String> uniqueValue = ls.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueValue);

    }
}
