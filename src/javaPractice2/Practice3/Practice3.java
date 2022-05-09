package javaPractice2.Practice3;

public class Practice3 {
    public static void main(String[] args) {
        Clock c1 = new Clock(10, 15, 30);

        c1.showData();
        System.out.println();

        AlarmClock c2 = new AlarmClock(15, 45, 20, 6, 30);

        c2.showData();
    }
}
