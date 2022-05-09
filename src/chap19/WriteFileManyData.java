package chap19;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFileManyData {
    public static void main(String[] args) {
        // 쓰기데이터를 배열에 준비
        String[] strArray = {"* 전세계 - 감사합니다.", "한국어 - 감사합니다", "일본어 - 아리가또", "영어 - Thank you", "중국어 - 시예시예", "독일어 - 단케", "스페인어 - 그라시아스", "프랑스어 - 메르시", "하와이어 - 마할로", "베트남어 - 캄온"};
        try{
            // 쓰기 파일 열기
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("output2.txt")));

            // 반복처리로 쓰기
            for(int i = 0; i < strArray.length; i++){
                pw.println(strArray[i]);
            }
            // 쓰기 파일 닫기
            pw.close();
            System.out.println("파일에 쓰기가 완료되었습니다.");
        }catch(IOException e){
            System.out.println(e + "입출력 오류입니다.");
        }
    }
}
