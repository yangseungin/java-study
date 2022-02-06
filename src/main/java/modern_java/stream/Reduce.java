package modern_java.stream;

import java.util.List;
import java.util.Optional;

import static java.util.Arrays.asList;

public class Reduce {
    public static void main(String[] args) {

        List<Integer> numbers = asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .reduce(0, Integer::sum);


        Optional<Integer> reduce = numbers.stream().reduce(Integer::max);
        System.out.println(reduce.get());




    }
}
