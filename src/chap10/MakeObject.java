package chap10;

class Computer1{
    String os;
    int mamory;
}
public class MakeObject {
    public static void main(String[] args) {
        Computer1 com;
        com = new Computer1();
        System.out.println("com = " + com);
    }
}
