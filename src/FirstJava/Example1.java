package FirstJava;

import java.util.List;

public class Example1 {
    interface Named{
        String name();

        default String greeting(){
            return "Hello, %s".formatted(name());
        }
    }
    record Staff(String name, String job) implements Named {
    }

    public static void main(String[] args) {
        var people = List.of(new Staff("park", "developer"), new Staff("kim", "teacher"));
        for(Named p : people){
            var n = p.name();
            var m = p.greeting();
            System.out.println("안녕하세요 %s 님".formatted(n));
            System.out.println(m);
        }
    }
}
