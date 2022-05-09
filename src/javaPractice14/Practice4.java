package javaPractice14;

import java.util.Calendar;
import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;
public class Practice4 {
    private static int counter = 0;
    private static int day;

    private int x = 0;
    private int y = 0;

    static{
        GregorianCalendar today = new GregorianCalendar();
        day = today.get(DATE);
    }

    {
        if(++counter == day){
            System.out.print("당첨!");
            System.out.printf("오늘 %d의 좌표가 생성되었습니다.\n", counter);
        }
    }

    public Practice4() {}
    public Practice4(int x) {
        this.x = x;
    }
    public Practice4(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public static int getCounter(){
        return counter;
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }


}
class Practice4Test{
    public static void main(String[] args) {
        for(int i=0; i < 36; i++){
            Practice4 p1 = new Practice4();
            System.out.printf("%2d %s\n", i, p1);
        }
    }
}
