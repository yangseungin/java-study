package modern_java.behavior_parameterization;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

enum Field {IT, HISTORY, FICTION}

public class Main {
    public static void main(String[] args) {
        List<Book> books = asList(new Book("이펙티브 자바", "조슈아 블로크", 2018, "IT"),
                new Book("모던 자바 인 액션", "라울-게이브리얼 우르마", 2019, "IT"),
                new Book("이순신의 바다", "황현필", 2021, "History"),
                new Book("갈매기의 꿈", "리처드 바크", 2020, "Fiction")
        );
        List<Book> itBooks = filterITBooks(books);

        List<Book> historyBooks = filterBooksByField(books, "History");
        List<Book> fictionBooks = filterBooksByField(books, "Fiction");

        List<Book> year2021Books = filterBooksByYear(books, 2021);

        List<Book> modenJavaBook = allFilterBooks(books, "모던 자바 인 액션", "라울-게이브리얼 우르마", 2019, "IT");


    }

    //it분야 필터링
    public static List<Book> filterITBooks(List<Book> inventory) {
        List<Book> result = new ArrayList<>();
        for (Book book : inventory) {
            if ("IT".equals(book.getField())) {
                result.add(book);
            }
        }
        return result;
    }

    //분야를 파라미터
    public static List<Book> filterBooksByField(List<Book> inventory, String field) {
        List<Book> result = new ArrayList<>();
        for (Book book : inventory) {
            if (field.equals(book.getField())) {
                result.add(book);
            }
        }
        return result;
    }

    //출판년도를 파라미터
    public static List<Book> filterBooksByYear(List<Book> inventory, int year) {
        List<Book> result = new ArrayList<>();
        for (Book book : inventory) {
            if (book.getYear() == year) {
                result.add(book);
            }
        }
        return result;
    }

    // 모든조건 필터링
    public static List<Book> allFilterBooks(List<Book> inventory, String name, String author, int year, String field) {
        List<Book> result = new ArrayList<>();
        for (Book book : inventory) {
            if (book.getName().equals(name) || book.getAuthor().equals(author) || book.getYear() == year || book.getField().equals(field)) {
                result.add(book);
            }
        }
        return result;
    }


}
