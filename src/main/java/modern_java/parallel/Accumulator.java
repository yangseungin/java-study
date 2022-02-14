package modern_java.parallel;

import java.util.stream.LongStream;

public class Accumulator {
    public long total = 0;

    public static void main(String[] args) {
        System.out.println(sideEffectSum(1000L));
    }

    public static long sideEffectSum(long n) {
        Accumulator accumulator = new Accumulator();
        LongStream.rangeClosed(1, n).parallel().forEach(accumulator::add);
        return accumulator.total;
    }


    public void add(long value) {
        total += value;
    }
}
