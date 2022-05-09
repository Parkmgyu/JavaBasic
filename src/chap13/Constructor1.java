package chap13;

class Computer1 {
    private String os;
    private int memory;

    // 인수없는 생성자
    public Computer1() {
        // 필드변수에 초기값 설정
        this.os = null;
        this.memory = 0;
        System.out.println("PC가 생성되었습니다.");
    }

    public void show(){
        System.out.println("PC의 OS는 " + os + "입니다.");
        System.out.println("메모리는 " + memory + "GB입니다.");
    }
}
public class Constructor1 {
    public static void main(String[] args) {
        System.out.println("=== 인수없는 생성자 실행 전 ===");
        Computer1 com = new Computer1();
        System.out.println("=== 인수없는 생성자 실행 후 ===");
        com.show();
    }
}
