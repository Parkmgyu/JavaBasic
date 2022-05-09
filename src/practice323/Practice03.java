package practice323;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        practice03();
    }
    public static void practice03(){
        Scanner sc = new Scanner(System.in);
        int cost = sc.nextInt();
        int thousand = 1000;
        int hundred = 100;
        int x = cost / thousand;
        int rest = cost % thousand;
        int y = rest / hundred;
        System.out.println("1000원 구슬은 " + x + "매이고, 100원 구슬은 " + y + "매입니다.");
    }
}
