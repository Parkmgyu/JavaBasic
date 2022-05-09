package javaPractice14;

public class Practice5 {
    public static void main(String[] args) {
        for(char ch = 0X21; ch <= 0X7E; ch++){
            System.out.printf("%c %04x\n", ch, (int)ch);
        }
    }
}
