package practiceMethod;

public class Practice01 {
    public static void main(String[] args) {
        practice01(1);
        practice01(2);
        practice01(3);
        practice01(4);
        practice01(5);
        practice01(6);
        practice01(7);
        practice01(8);
        practice01(9);
    }
    public static void practice01(int i){
        for(int j = 1; j <10; j++) {
            System.out.println(i + "*" + j + "=" + i * j);
        }
    }
}
