package javaPractice2.Practice3;

public class AlarmClock extends Clock{
    private int alarmHour;
    private int alarmMinute;

    public AlarmClock(int hour, int minute, int second, int alarmHour, int alarmMinute){
        super(hour, minute, second);
        this.alarmHour = alarmHour;
        this.alarmMinute = alarmMinute;
    }

    @Override
    public void showData(){
        super.showData();
        System.out.println("알람 설정 시간: " + alarmHour + "시 " + alarmMinute + "분");
    }
}
