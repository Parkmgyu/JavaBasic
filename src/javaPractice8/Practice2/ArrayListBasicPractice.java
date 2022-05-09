package javaPractice8.Practice2;

import java.util.ArrayList;

public class ArrayListBasicPractice {
    public static void main(String[] args) {
        ArrayList<String> number = new ArrayList<String>();

        number.add( "zero" );
        number.add( "one" );
        number.add( "two" );
        number.add( "three" );
        number.add( "four" );
        number.add( "five" );
        number.add( "six" );
        number.add( "seven" );
        number.add( "eight" );
        number.add( "nine" );
        number.add( "ten" );

        System.out.println ( "0에서 10까지의 영문 단어를 입력하십시오" );
        String input = System.console().readLine();

        boolean flag = false;

        for(int i = 0; i < number.size(); i++){
            if(number.get(i).equals(input)){
                System.out.println(input + "는 숫자의 " + i + "입니다.");
                flag = true;
                break;
            }
        }

        if(!flag){
            System.out.println(input + "는 영어단어가 아닙니다.");
        }
    }
}
