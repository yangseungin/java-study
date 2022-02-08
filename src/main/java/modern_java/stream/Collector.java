package modern_java.stream;

import modern_java.behavior_parameterization.Book;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Collector {
    public static void main(String[] args) {
        List<Book> books = asList(new Book("2022신상책", "양승인", 2022, "IT"),
                new Book("이순신의 바다", "황현필", 2021, "History"),
                new Book("갈매기의 꿈", "리처드 바크", 2020, "Fiction"),
                new Book("모던 자바 인 액션", "라울-게이브리얼 우르마", 2020, "IT"),
                new Book("2019년 책", "양승인", 2019, "IT"),
                new Book("이펙티브 자바", "조슈아 블로크", 2018, "IT")
        );

        Integer collect = books.stream()
                .collect(Collectors.summingInt(Book::getYear));
        Double collect1 = books.stream()
                .collect(Collectors.averagingInt(Book::getYear));
        IntSummaryStatistics collect2 = books.stream()
                .collect(Collectors.summarizingInt(Book::getYear));
        
    }
}
