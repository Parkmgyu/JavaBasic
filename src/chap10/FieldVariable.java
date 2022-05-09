package chap10;

class Computer2 {
    String os;
    int memory;
}
public class FieldVariable{

    public static void main(String[] args) {
        Computer2 com = new Computer2();

        com.os = "Windows 11";
        com.memory = 32;

        System.out.println("컴퓨터 os은 " + com.os + "입니다.");
        System.out.println("메모리 크기는 " + com.memory + "GB입니다.");
    }
}
