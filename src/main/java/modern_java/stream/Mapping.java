package modern_java.stream;

import modern_java.behavior_parameterization.Book;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Mapping {
    public static void main(String[] args) {
        List<Book> books = asList(new Book("2022신상책", "양승인", 2022, "IT"),
                new Book("이순신의 바다", "황현필", 2021, "History"),
                new Book("갈매기의 꿈", "리처드 바크", 2020, "Fiction"),
                new Book("모던 자바 인 액션", "라울-게이브리얼 우르마", 2020, "IT"),
                new Book("2019년 책", "양승인", 2019, "IT"),
                new Book("이펙티브 자바", "조슈아 블로크", 2018, "IT")
        );

        List<String> bookNames = books.stream().
                map(Book::getName)
                .collect(Collectors.toList());

        List<String> helloWorld = asList("Hello", "World");

        List<String> collect = helloWorld.stream()
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        Optional<Book> first = books.stream().findFirst();
        Optional<Book> any = books.stream().findAny();

        OptionalDouble average = books.stream().mapToInt(Book::getYear)
                .average();

        IntStream intStream = books.stream().mapToInt(Book::getYear);
        Stream<Integer> boxed = intStream.boxed();

        IntStream evenNumbers = IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 == 0);

        Stream<String> alphabet = Stream.of("A", "B", "C", "D", "E");
        Stream<Integer> evenNumber = Stream.of(2, 4, 6, 8, 10);
        Stream<Object> empty = Stream.empty();

        Stream<String> key = Stream.ofNullable(System.getProperty("key"));

        int[] num = {1, 2, 3, 4, 5, 6};
        int sum = Arrays.stream(num).sum();


        long uniqueWords = 0;
        try (Stream<String> lines =
                     Files.lines(Paths.get("data.txt"), Charset.defaultCharset())) {
            uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" ")))
                    .distinct()
                    .count();
        } catch (IOException e) {

        }


        Stream.iterate(0, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

        Stream.generate(Math::random)
                .limit(10)
                .forEach(System.out::println);
    }
}
