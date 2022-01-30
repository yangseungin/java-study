package modern_java.lambda;

import modern_java.behavior_parameterization.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static java.util.Comparator.comparing;

public class Stream {
    public static void main(String[] args) {
        List<Book> books = asList(new Book("이펙티브 자바", "조슈아 블로크", 2018, "IT"),
                new Book("모던 자바 인 액션", "라울-게이브리얼 우르마", 2020, "IT"),
                new Book("이순신의 바다", "황현필", 2021, "History"),
                new Book("갈매기의 꿈", "리처드 바크", 2020, "Fiction"),
                new Book("2022신상책", "양승인", 2022, "IT")
        );

        List<String> booksNameSortedByYearAfter2020 = getBooksNameSortedByYearAfter2020(books);
        List<String> booksName2 = getBooksName2(books);
    }

    //자바 8 이전 - 2020년이후 발행된 책을 년도순으로 정렬하여 책이름을 반환
    private static List<String> getBooksNameSortedByYearAfter2020(List<Book> books) {
        //2020년 이후책
        List<Book> booksAfter2020 = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() >= 2020) {
                booksAfter2020.add(book);
            }
        }
        //연도순 정렬
        Collections.sort(booksAfter2020, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return Integer.compare(book1.getYear(), book2.getYear());
            }
        });
        List<String> booksNameAfter2020 = new ArrayList<>();
        for (Book book : booksAfter2020) {
            booksNameAfter2020.add(book.getName());
        }
        return booksNameAfter2020;
    }

    //자바 8 이후 - 2020년이후 발행된 책을 년도순으로 정렬하여 책이름을 반환
    private static List<String> getBooksName2(List<Book> books) {
        //2020년 이후책
        List<String> collect = books.stream()
                .filter(book -> book.getYear() >= 2020)
                .sorted(comparing(Book::getYear))
                .map(Book::getName)
                .collect(Collectors.toList());
        return collect;
    }


}
