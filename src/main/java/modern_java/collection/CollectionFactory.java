package modern_java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionFactory {
    public static void main(String[] args) {
        List<Integer> nation = new ArrayList<>();
        nation.add(1);
        nation.add(2);
        nation.add(3);
        nation.add(4);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        numbers.set(0, 10);
//        numbers.add(5); //고정크기의 리스트여서 갱신은 가능하나 추가 불가능

        List<Integer> oddNumbers = List.of(1, 3, 5, 7, 9);
//        oddNumbers.set(0,11);
//        oddNumbers.add(11);

        Set<Integer> integers = Set.of(1, 2, 3);

        Map<String, Integer> friends = Map.of("hodong", 24, "tom", 27);

        Map<String, Integer> friends2 = Map.ofEntries(Map.entry("hodong", 24)
                , Map.entry("tom", 27));

        List<Integer> collect = IntStream.rangeClosed(1, 50).boxed().collect(Collectors.toList());
        collect.removeIf(integer -> integer < 40);
        System.out.println(collect); // 40~50 출력

        List<Integer> from1to50 = IntStream.rangeClosed(1, 50).boxed().collect(Collectors.toList());
        from1to50.replaceAll(integer -> integer + 50);
        System.out.println(from1to50); // 51~ 100 출력

        Map<String, String> user = Map.of("hodong123", "김호동", "gildong443", "홍길동", "tomsday", "tom");
        user.forEach((id, name) -> System.out.println(id + " / " + name));


    }
}
