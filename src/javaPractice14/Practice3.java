package javaPractice14;

public class Practice3 {
    public static void main(String[] args) {
        Human3 gildong = new Human3("홍길동", 170, 60, new Day(1975, 3, 12));
        Human3 sunshin = new Human3("이순신", 169, 72, new Day(1987, 10, 7));

        System.out.println("gildong = " + gildong);
        System.out.println("sunshin = " + sunshin);
    }
}
class Human3{
    private String name;
    private int height;
    private int weight;
    private Day birthday;

    Human3(String name, int height, int weight, Day birthday){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.birthday = new Day(birthday);
    }

   public String getName(){
        return name;
    }

    public int getHeight(){
        return height;
    }

   public int getWeight(){
        return weight;
    }

    public Day getBirthday(){
        return new Day(birthday);
    }
    void gainWeight(int w){
        weight += w;
    }

    public void reduceWeight(int w){
        weight -= w;
    }

    public void putData(){
        System.out.println("이름: " + name);
        System.out.println("신장: " + height + "cm");
        System.out.println("체중: " + weight + "kg");
    }

    public String toString(){
        return "{" + name + ": " + height + "cm " + weight + "kg " + birthday + "출생}";
    }
}

class Day{
    private int year = 1;
    private int month = 1;
    private int date = 1;

    public Day(){}
    public Day(int year){
        this.year = year;
    }

    public Day(int year, int month){
        this(year);
        this.month = month;
    }

    public Day(int year, int month, int date){
        this(year, month);
        this.date = date;
    }

    public Day(Day d){
        this(d.year, d.month, d.date);
    }

    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDate(){
        return date;
    }

    public void setYear(){
        this.year = year;
    }

    public void setMonth(){
        this.month = month;
    }

    public void setDate(){
        this.date = date;
    }

    public void set(int year, int month, int date){
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public int dayOfWeek(){
        int y = year;
        int m = month;
        if (m == 1 || m == 2) {
            y--;
            m += 12;
        }
        return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
    }

    public boolean equalTo(Day d){
        return year == d.year && month == d.month && date == d.date;
    }

    public String toString(){
        String[] wd = {"일", "월", "화", "수", "목", "금", "토"};

        return String.format("%04d년 %02d월 %02d일(%s)", year, month, date, wd[dayOfWeek()]);
    }
}