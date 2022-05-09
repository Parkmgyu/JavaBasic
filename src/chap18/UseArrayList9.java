package chap18;

import java.util.ArrayList;

public class UseArrayList9 {
    /*
    * 인수에 문자열을 취급하는 ArrayList배열을 받아, 그 배열의 모든 데이터를 표시함
     */
    public static void showArrayListData(ArrayList<String> tmpStrList){
        for(int i = 0; i < tmpStrList.size(); i++){
            System.out.println((i + 1) + "번째 저장 데이터는 " + tmpStrList.get(i) + "입니다.");
        }
    }
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<String>();

        // 문자열 추가
        strList.add("Good morning");
        strList.add("Hello");
        strList.add("Bye");

        //반복처리를 이용하여 전건 표시
        System.out.println("* 지우기 전 데이터 목록");
        showArrayListData(strList);

        //ArrayList배열 초기화
        strList.clear();

        System.out.println("\n* 지우기 후 데이터 목록");
        //ArrayList배열 저장 데이터 수 확인
        if(strList.isEmpty()){
            System.out.println("데이터 1개 없음");
        }else{
            showArrayListData(strList);
        }
    }
}
