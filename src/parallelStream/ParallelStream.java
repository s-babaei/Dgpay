package parallelStream;

import java.util.stream.IntStream;

public class ParallelStream {


    public static void main(String[] args) {

        System.out.println("Normal...");

        IntStream range = IntStream.rangeClosed(1, 100);

        range.forEach(System.out::println);

        System.out.println("Parallel...");

        IntStream range2 = IntStream.rangeClosed(1, 100);
        range2.parallel().forEach(value -> System.out.println(Thread.currentThread().getName()));
    }
}