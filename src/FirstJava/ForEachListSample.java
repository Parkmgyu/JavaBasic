package FirstJava;

import java.util.List;

public class ForEachListSample {
    public static void main(String[] args) {
        var names = List.of("홍길동", "이순신", "신사임당");
//        var strs = List.of("apple", "grape", "watermelon");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
