package javaPractice2;

public class Practice8 {
    public static void main(String[] args) {
        int a = 18;
        int b = 6;

        System.out.println("덧셈:" + calc(a, b, 0));
        System.out.println("뺄셈:" + calc(a, b, 1));
        System.out.println("곱셈:" + calc(a, b, 2));
        System.out.println("나눗셈:" + calc(a, b, 3));
    }
    public static int calc(int a, int b, int i){
        int result = 0;
        switch(i){
            case 0:
                result = a + b;
                break;
            case 1:
                result = a - b;
                break;
            case 2:
                result = a * b;
                break;
            case 3:
                result = a / b;
                break;
            default:
                result = 0;
        }
        return result;
    }
}
