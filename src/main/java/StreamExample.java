import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
//        IntStream.of(50, 60, 70, 80, 90, 100, 110, 120).filter(x -> x < 90).map(x -> x - 10).limit(5).forEach(System.out::println);
        int sum = Stream.of(1, 2, 3, 4, 5).reduce(10, (acc, x) -> acc + x);

    }
}
