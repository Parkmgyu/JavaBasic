package chap12;

class Computer2 {
    private String os; // private 멤버변수
    private int memory; // private 멤버변수

    public void show() { // public 멤버 메소드
        System.out.println("PC의 OS는 " + os + "입니다.");
        System.out.println("메모리는 " + memory + "GB입니다.");
    }
}
public class PrivateMember {
    public static void main(String[] args) {
        Computer2 com = new Computer2();

//        com.os = "Windows 11"; // private 멤버변수(os)액세스
//        com.memory = -5445; // private 멤버변수(memory)액세스

        com.show();
    }
}
