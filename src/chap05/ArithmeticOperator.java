package chap05;

public class ArithmeticOperator {

    public static void main(String[] args){
        //계산용 값을 관리하는 변수를 선언하고 값을 할당
        int a = 9;
        int b = 4;

        //응답 변수
        int answer;

        System.out.print("a = ");
        System.out.println(a);
        System.out.print("b = ");
        System.out.println(b);

        //덧셉
        answer = a + b;
        System.out.print("a + b = ");
        System.out.println(answer);

        //뺄셈
        answer = a - b;
        System.out.print("a - b = ");
        System.out.println(answer);

        //곱셈
        answer = a * b;
        System.out.print("a * b = ");
        System.out.println(answer);

        //나눗셈
        answer = a / b;
        System.out.print("a / b = ");
        System.out.println(answer);

        //나머지
        answer = a % b;
        System.out.print("a % b = ");
        System.out.println(answer);
    }
}
