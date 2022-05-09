package Exercise;

public class PrimitiveCastPractice {
    public static void main(String[] args) {
        short s1 = 65;
        System.out.println(s1);

        byte b = (byte)s1;
        System.out.println(b);

        char c = (char)b;
        System.out.println(c);

        short s2 = (short) (s1 + b);
        System.out.println(s2);
    }
}
