package chap13;

class Computer2 {
    private String os;
    private int memory;

    // 인수없는 생성자
    public Computer2(String os, int memory) {
        // 필드변수에 초기값 설정
        this.os = os;
        this.memory = memory;
        System.out.println("OS는 " + os + "이고, 메모리는 " + memory + "GB의 PC가 만들어졌습니다.");
    }

    public void show(){
        System.out.println("PC의 OS는 " + os + "입니다.");
        System.out.println("메모리는 " + memory + "GB입니다.");
    }
}
public class Constructor2 {
    public static void main(String[] args) {
        System.out.println("=== 인수없는 생성자 실행 전 ===");
        Computer2 com = new Computer2("Windows 11", 32);
        System.out.println("=== 인수없는 생성자 실행 후 ===");
        com.show();
    }
}
