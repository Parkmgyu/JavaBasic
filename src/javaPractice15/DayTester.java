package javaPractice15;

import java.util.Scanner;

public class DayTester {
    static Scanner sc = new Scanner(System.in);

    static void display(Day day){
        System.out.println(day + "에 관한 정보");
        System.out.println("윤년" + (day.isLeap() ? "입니다." : "이 아닙니다."));
        System.out.println("년도 내 경과일수: " + day.dayOfYear());
        System.out.println("년도 내 잔여일수: " + day.leftDayOfYear());
    }

    static void change(Day day){
        System.out.println("[1]년월일 변경 [2]년도변경 [3]월변경 [4]일변경");
        System.out.println("[5]1일뒤 [6]1일앞 [7]n일뒤 [8]n일앞");
        int change = sc.nextInt();
        int y = 0, m = 0, d = 0, n = 0;
        if(change == 1 || change == 2){
            System.out.print("년도: ");
            y = sc.nextInt();
        }
        if(change == 1 || change == 3){
            System.out.print("월: ");
            m = sc.nextInt();
        }
        if(change == 1 || change == 4){
            System.out.print("일: ");
            d = sc.nextInt();
        }
        if(change == 7 || change == 8){
            System.out.print("일자수: ");
            n = sc.nextInt();
        }

        switch (change) {
            case 1 -> day.set(y, m, d);
            case 2 -> day.setYear();
            case 3 -> day.setMonth();
            case 4 -> day.setDate();
            case 5 -> day.succeed();
            case 6 -> day.precede();
            case 7 -> day.succeedDays(n);
            case 8 -> day.precedeDays(n);
        }
        System.out.print(day + "로 변경되었습니다.");
    }

    static void compare(Day day){
        System.out.println("날짜를 입력하세요");
        System.out.print("년도: ");
        int y = sc.nextInt();
        System.out.print("월: ");
        int m = sc.nextInt();
        System.out.print("일: ");
        int d = sc.nextInt();

        Day d2 = new Day(y, m, d);

        int comp = day.compareTo(d2);
        System.out.print(day);
        switch (comp) {
            case -1 -> System.out.println("가 앞");
            case 1 -> System.out.println("가 뒤");
            case 0 -> System.out.println("와 같다");
        }
    }

    static void beforeAfter(Day day){
        System.out.println("[1]내일 [2]어제 [3]n일 후 [4]n일 전");
        int type = sc.nextInt();

        int n = 0;

        if(type == 3 || type == 4){
            System.out.print("며칠: ");
            n = sc.nextInt();
        }

        System.out.print("이 남은 ");
        switch (type) {
            case 1 -> System.out.print(day.succeedingDay());
            case 2 -> System.out.print(day.precedingDay());
            case 3 -> System.out.print(day.after(n));
            case 4 -> System.out.print(day.before(n));
        }
        System.out.println("입니다.");
    }
    public static void main(String[] args) {
        System.out.println("날짜를 입력하세요");
        System.out.print("년도: ");
        int y = sc.nextInt();
        System.out.print("월: ");
        int m = sc.nextInt();
        System.out.print("일: ");
        int d = sc.nextInt();

        Day day = new Day(y, m, d);

        while(true){
            System.out.print("[1]날짜관련정보 표시 [2]날짜변경 [3]다른 날짜와의 비교 [4]전후 날짜 [5]종료: ");
            int menu = sc.nextInt();

            if(menu == 5) {
                break;
            }
            switch (menu) {
                case 1 -> display(day);
                case 2 -> change(day);
                case 3 -> compare(day);
                case 4 -> beforeAfter(day);
            }
        }


    }
}


