package modern_java.collection;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class UseMap {
    public static void main(String[] args) {
        Map<String, String> user = Map.of("hodong123", "김호동", "gildong443", "홍길동", "tomsday", "tom");
        user.forEach((id, name) -> System.out.println(id + " / " + name));

        Map<String, String> favoriteFruit = Map.ofEntries(
                entry("홍길동", "사과"),
                entry("김계란", "바나나"),
                entry("강호동", "파인애플")
        );
        favoriteFruit.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(System.out::println);

        System.out.println(favoriteFruit.getOrDefault("이수근", "키위"));
        Map<String, String> like = new HashMap<>();
        like.put("강호동", "사과");
        like.put("이수근", "파인애플");
        like.put("김계란", "바나나");

        like.remove("김계란", "다른과일");
        like.remove("김계란", "바나나");
        System.out.println(like);

        like.replace("강호동", "키위");
        like.replace("강호동", "키위", "멜론");
        like.replaceAll((name, fruit) -> "상태 좋은 " + fruit);

        Map<String,String> favoriteMovie = new HashMap<>();
        favoriteMovie.put("아빠","스타워즈");
        favoriteMovie.put("엄마","해리포터");
        favoriteMovie.put("애기","반지의제왕");

        Map<String,String> dislikedMovie = new HashMap<>();
        dislikedMovie.put("아빠","스파이더맨");
        dislikedMovie.put("엄마","배트맨");
        dislikedMovie.put("할아버지","앤트맨");

//        favoriteMovie.putAll(dislikedMovie);
        favoriteMovie.forEach((key, value) -> dislikedMovie.merge(key,value,(movie1, movie2) -> movie1 + " & "+movie2));




    }
}
