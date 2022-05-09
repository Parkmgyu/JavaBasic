package chap20;

public class UseToStringMethod {
    public static void main(String[] args) {
        //Computer5 클래스의 객체 생성
        Computer5 com1 = new Computer5();
        System.out.println(com1);

        //Computer6클래스의 객체 생성
        Computer6 com2 = new Computer6();
        com2.setOsMemory("Window 10", 16);
        System.out.println(com2);
    }
}
