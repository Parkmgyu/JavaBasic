package javaPractice2.Practice3;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void showData(){
        System.out.println("현재 시간 : " + hour + "시" + minute + "분" + second + "초");
    }

}
