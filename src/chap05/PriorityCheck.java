package chap05;

public class PriorityCheck {

    public static void main(String[] args){

        //계산용 값을 관리하는 변수를 선언하고 값 할당
        int a = 9;
        int b = 1;
        int c = 3;
        int d = 5;
        int e = 8;

        //응답 변수
        int answer;

        System.out.print("a = ");
        System.out.println(a);

        System.out.print("b = ");
        System.out.println(b);

        System.out.print("c = ");
        System.out.println(c);

        answer = a + b * c;
        System.out.print("a + b * c = ");
        System.out.println(answer);

        answer = (a + b) * c;
        System.out.print("(a + b) * c = ");
        System.out.println(answer);

        answer = a + b + c / d + e;
        System.out.print("a + b + c / d + e = ");
        System.out.println(answer);

        answer = (a + b + c) / (d + e);
        System.out.print("(a + b + c) / (d + e) = ");
        System.out.println(answer);
    }
}
