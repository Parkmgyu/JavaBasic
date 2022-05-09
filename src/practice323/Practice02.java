package practice323;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        practice02();
    }
    public static void practice02(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = b*b-4*a*c;
        if(d>0){
            System.out.println("2개의 실수해를 가지고 있음.");
        } else if(d==0){
            System.out.println("중근을 가지고 있음");
        } else{
            System.out.println("2개의 허수해를 가지고 있음.");
        }
    }
}
