package chap06;

import java.util.Scanner;

public class IfElseStatement {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("year 입력 : ");
        String str = sc.nextLine();

        if(str.equals("year")){
            System.out.println(str+"가 입력되었습니다.");
        }else{
            System.out.println("다른값이 "+str+"입력되었습니다.");
        }
    }
}
