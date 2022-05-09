package FirstJava;

import java.util.List;
import java.util.stream.IntStream;

public class MethodRefSample {
    public static void main(String[] args) {
        IntStream.range(0, 3)
                .map(MethodRefSample::twice)
                .forEach(System.out::println);
        var names = List.of("홍길동", "이순신", "신사임당");
        names.stream().map(String::toLowerCase).toList();

        names.stream().map("%s님"::formatted).toList();

        names.stream().map(s->s.toLowerCase()).toList();
    }
    static int twice(int x){
        return x * 2;
    }
}
