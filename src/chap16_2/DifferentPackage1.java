package chap16_2; // DifferentPackage1클래스를 패키지에 포함함

public class DifferentPackage1 {
    public static void main(String[] args) {
        // 다른 패키지의 Computer3클래스를 완전 한정자명으로 지정하여 객체화
        chap16_1.Computer3 com = new chap16_1.Computer3();
        com.setOsMemory("Windows 11", 32);
        com.show();
    }
}
