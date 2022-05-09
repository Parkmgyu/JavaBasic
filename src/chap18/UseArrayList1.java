package chap18;

import java.util.ArrayList;

public class UseArrayList1 {
    public static void main(String[] args) {
        // 문자열 처리하는 가변길이배열
        ArrayList<String> strList = new ArrayList<String>();

        //1번 문자열 추가
        strList.add("Good morning");
        System.out.println("첫번째 추가시 모든 데이터는 " + strList + "입니다.");

        //2번 문자열 추가
        strList.add("Hello");
        System.out.println("2번 추가시의 모든 데이터는 " + strList + "입니다.");

        //3번 문자열 추가
        strList.add("Bye");
        System.out.println("3번 추가시의 모든 데이터는 " + strList + "입니다.");

    }
}
