package modern_java.behavior_parameterization;

import java.util.List;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        List<Book> books = asList(new Book("이펙티브 자바", "조슈아 블로크", 2018, "IT"),
                new Book("모던 자바 인 액션", "라울-게이브리얼 우르마", 2019, "IT"),
                new Book("이순신의 바다", "황현필", 2021, "역사"),
                new Book("갈매기의 꿈", "리처드 바크", 2020, "소설")
        );
    }

}
