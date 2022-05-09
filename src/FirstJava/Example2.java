package FirstJava;

import java.util.List;

public class Example2 {
    interface Figure{
        int width();
        int height();
    }
    record Box(int width, int height) implements Figure{
    }
    record Oval(int width, int height) implements Figure{
    }
    public static void main(String[] args) {
        var figure = List.of(new Box(200, 200), new Oval(400, 300));
        for(Figure f : figure){
            var w = f.width();
            var h = f.height();
            System.out.println("너비는 %d 높이는 %d".formatted(w, h));
        }
    }
}
