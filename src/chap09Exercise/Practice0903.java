package chap09Exercise;

import java.util.Scanner;

public class Practice0903 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        dispLine(sc.nextInt());
    }

    static void dispLine(int num){
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
                outSigh();
            }
            System.out.println();
        }
    }

    static void outSigh(){
        System.out.print("* ");
    }
}
