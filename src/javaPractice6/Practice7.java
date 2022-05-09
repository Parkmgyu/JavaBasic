package javaPractice6;

import java.util.Random;
import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] dayArrKor = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
        String[] dayArrEng = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};

        System.out.println("요일명을 영어 소문자로 입력하시오.");

        int retry ;
        int last = -1;
        do{
            int day;
            do{
                day = rand.nextInt(7);
            }while(day == last);
            last = day;

            while(true){
                System.out.println(dayArrKor[day]);
                String s = sc.next();

                if(s.equals(dayArrEng[day])){
                    break;
                }
                System.out.println("틀렸습니다. ");

            }
            System.out.println("정답입니다. 다시한번? 1 / 0");
            retry = sc.nextInt();
        }while(retry == 1);

    }
}
