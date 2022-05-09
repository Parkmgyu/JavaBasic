package chap18;

import java.util.ArrayList;

public class UseArrayList4 {
    public static void main(String[] args) {
        // 문자열을 처리하는 ArrayList배열
        ArrayList<String> strList = new ArrayList<String>();

        //문자열 추가
        strList.add("Good morning");
        strList.add("Hello");
        strList.add("Bye");

        // 반복처리를 이용하여 전건 표시
        for(int i = 0; i < strList.size(); i++){
            System.out.println((i + 1) + "번째 저장 데이터는 " + strList.get(i) + "입니다.");
        }
    }
}
