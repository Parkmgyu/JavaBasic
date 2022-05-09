package practice323;

import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        practice04();
    }
    public static void practice04(){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println("윤년입니다.");
        } else{
            System.out.println("윤년이 아닙니다.");
        }
    }
}
