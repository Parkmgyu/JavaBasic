package chap15Exercise;

public class Books2 {
    private static int count = 0;
    private String title;
    private int price;
    private int number;

    public Books2(String title, int price){
        this.title = null;
        this.price = 0;
        count++;
        this.number = count;
    }


    public void showBook(){
        System.out.println("이 책의 제목은 " + this.title + ", 가격은 " + price + "입니다.");
        System.out.println("생성 번호는 " + this.number + "입니다.");
    }

    public static int getCount(){
        return count;
    }
}
