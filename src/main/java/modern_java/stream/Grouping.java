package modern_java.stream;

import modern_java.behavior_parameterization.Book;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Grouping {
    public static void main(String[] args) {
        List<Book> books = asList(new Book("2022신상책", "양승인", 2022, "IT"),
                new Book("이순신의 바다", "황현필", 2021, "History"),
                new Book("갈매기의 꿈", "리처드 바크", 2020, "Fiction"),
                new Book("모던 자바 인 액션", "라울-게이브리얼 우르마", 2020, "IT"),
                new Book("2019년 책", "양승인", 2019, "IT"),
                new Book("이펙티브 자바", "조슈아 블로크", 2018, "IT")
        );

        Map<String, List<Book>> collect = books.stream().collect(Collectors.groupingBy(Book::getField));

        Map<String, List<Book>> collect1 = books.stream()
                .filter(book -> book.getYear() >= 2021)
                .collect(Collectors.groupingBy(Book::getField));

        Map<String, List<Book>> collect2 = books.stream()
                .collect(Collectors.groupingBy(Book::getField, Collectors.filtering(book -> book.getYear() >= 2021, Collectors.toList())));

        Map<String, List<String>> collect3 = books.stream()
                .collect(Collectors.groupingBy(Book::getField, Collectors.mapping(Book::getName, Collectors.toList())));


        Map<String, Map<String, List<Book>>> collect4 = books.stream()
                .collect(Collectors.groupingBy(Book::getField, Collectors.groupingBy(book -> {
                    if (book.getYear() < 2020) {
                        return "old book";
                    } else {
                        return "new book";
                    }
                })));

        Map<Boolean, List<Book>> collect5 = books.stream()
                .collect(Collectors.partitioningBy(book -> book.getYear() < 2020));
        

    }
}
