package chap17exercise;

import java.util.Scanner;

public class Practice1701 {
    public static void main(String[] args) {
        try{
            int cnt = 0; // 입력수
            int sum = 0; // 총점
            int ave = 0; // 평균 (소수점 이하는 자름)
            int[] num = new int[3]; // 입력숫자 저장하는 배열

            Scanner sin = new Scanner(System.in); // scanner클래스 객체화

            // 반복처리 (배열의 요소수)
            while(true) {
                // 키보드에서 숫자 입력하고 배열에 저장
                System.out.println("(숫자 입력(999에서는 강제종료)): ");
                int tmpnum = sin.nextInt();

                // 입력값이 999이면 강제 종료
                if(tmpnum == 999){
                    break;
                }
                num[cnt] = tmpnum; // 배열에 데이터 지정
                cnt++; // 입력수 계산
            }

            // 반복처리(배열의 요소수분)
            for(int i = 0; i < cnt; i++){
                // 입력수치를 총점에 추가
                sum += num[i];
            }
            // 평균 계산
            ave = sum / cnt;
            // 각 결과를 화면에 출력
            System.out.println("입력수: " + cnt);
            System.out.println("총점: " + sum);
            System.out.println("평균점: " + ave);
        } catch(Exception e){
            System.out.println(e + "라는 예외가 발생했습니다.");
        }
        System.out.println("처리 종료");
    }
}
