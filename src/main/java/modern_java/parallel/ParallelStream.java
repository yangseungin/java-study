package modern_java.parallel;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ParallelStream {
    public static long NUMBER = 10_000_000L;

    public static void main(String[] args) {
//        System.out.println(iterativeSum(NUMBER));
//        System.out.println(sequentialSum(NUMBER));
//        System.out.println(parallelSum(NUMBER));
//        System.out.println(parallelSum(NUMBER));
    }

    //기본 반복문
    public static long iterativeSum(long n) {
        long result = 0;
        for (long i = 1L; i <= n; i++) {
            result += i;
        }
        return result;
    }

    //    순차
    public static long sequentialSum(long n) {
        return Stream.iterate(1L, i -> i + 1).limit(n).reduce(0L, Long::sum);
    }

    //    병렬
    public static long parallelSum(long n) {
        return Stream.iterate(1L, i -> i + 1).limit(n).parallel().reduce(0L, Long::sum);
    }

    //성능이 향상되는 케이스
    public long parallelRangedSum(long n) {
        return LongStream.rangeClosed(1, n).parallel().reduce(0L, Long::sum);
    }

}
