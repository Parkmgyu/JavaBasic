package chap08;

public class ChangeArrayElement1 {
    public static void main(String[] args){
        // 주거년수를 관리하기 위한 배열변수의 선언과 요소 초기화
        int[] jasonAPT = { 3, 1, 10 };

        System.out.println("0호 : " + jasonAPT[0]);
        System.out.println("1호 : " + jasonAPT[1]);
        System.out.println("2호 : " + jasonAPT[2]);

        // 일부 배열요소에 값을 할당
        jasonAPT[1] = 2;
        System.out.println();
        System.out.println(" - 변경후 거주년수 - ");

        System.out.println("0호 : " + jasonAPT[0]);
        System.out.println("1호 : " + jasonAPT[1]);
        System.out.println("2호 : " + jasonAPT[2]);
    }
}
