package chap08;

public class AssignValueIntoArray {
    public static void main(String[] args){

        // 주거연수를 관리하기 위한 배열변수 선언과 요소 작성하기
        int[] jasonAPT = new int[3];

        // 요소초기화
        jasonAPT[0] = 3;
        jasonAPT[1] = 1;
        jasonAPT[2] = 10;

        System.out.println("0호실 거주년수 : " + jasonAPT[0]);
        System.out.println("1호실 거주년수 : " + jasonAPT[1]);
        System.out.println("2호실 거주년수 : " + jasonAPT[2]);
    }
}
