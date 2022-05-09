package chap10;
class Computer4 {
    String os;
    int memory;

    // 필드변수의 값을 표시하는 메소드
    public void show() {
        System.out.println("PC의 OS는 " + os + "입니다.");
        System.out.println("메모리 크기는 " + memory + "GB입니다.");
    }
}
public class InstanceMethod1 {
    public static void main(String[] args) {
        // Computer4클래스에서 객체 생성
        Computer4 com = new Computer4();

        // 데이터를 저장하기 전에 메소드 호출 (1번째)
        System.out.println("* 1번째 메소드 호출");
        com.show();

        // 객체의 필드변수에 각 데이터를 저장함
        com.os = "Windows 11";
        com.memory = 32;

        // 데이터를 저장 후, 메소드 호출 (2번째)
        System.out.println("\n* 2번째 메소드 호출");
        com.show();
    }
}
