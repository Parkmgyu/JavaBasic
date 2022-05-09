package chap20;

public class UseEqualsMethod {
    public static void main(String[] args) {
        Computer5 com1 = new Computer5();
        Computer5 com2 = new Computer5();
        Computer5 com3 = com1;

        boolean check1 = com1.equals(com2);
        boolean check2 = com1.equals(com3);

        System.out.println("com1과 com2의 비교결과: " + check1);
        System.out.println("com1과 com3의 비교결과: " + check2);
    }
}
