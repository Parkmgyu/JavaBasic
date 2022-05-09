package chap20Exercise;

public class Books {
    private String title; //타이틀
    private int price; //가격

    public Books(){
        this.title = null;
        this.price = 0;
        System.out.println("책을 만들었습니다.");
    }

    public void setBook(String title, int price){
        this.title = title;
        this.price = price;
        System.out.println("이 팩 제목은 " + title + "이고, 가격은 " + this.price + "원으로 설정되었습니다.");
    }

    public void showBook(){
        System.out.println("이 책의 제목은 " + this.title + "이고, 가격은 " + this.price + "원입니다.");
    }
}
