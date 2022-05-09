package chap18;

import java.util.ArrayList;

public class UseArrayList2 {
    public static void main(String[] args) {
        // 문자열 처리하는 가변길이배열
        ArrayList<String> strList = new ArrayList<String>();

        //1번 문자열 추가
        strList.add("Good morning");
        System.out.println("1번째 저장 데이터는 " + strList.get(0) + "입니다.");

        //2번 문자열 추가
        strList.add("Hello");
        System.out.println("2번째 저장 데이터는 " + strList.get(1) + "입니다.");

        //3번 문자열 추가
        strList.add("Bye");
        System.out.println("3번째 저장 데이터는 " + strList.get(2) + "입니다.");

    }
}
