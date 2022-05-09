package chap17;

public class ArrayException2 {
    public static void main(String[] args) {
        try{
            // int형 배열 정의
            int[] intArray = new int[5];

            // 10인덱스에 값을 대입
            System.out.println("intArray[10]에 숫자를 할당합니다.");
            intArray[10] = 50; // 최대 배열요소수를 초과하는 대입처리

            // 결과 표시
            System.out.println("intArray[10]에 50을 할당했습니다.");
        } catch(ArrayIndexOutOfBoundsException e){ // 최대 배열 요소수 초과 예외처리
            System.out.println("배열의 요소수를 초과했습니다.");
        }

        System.out.println("프로그램 종료");
    }
}
