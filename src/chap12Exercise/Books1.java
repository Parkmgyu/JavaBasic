package chap12Exercise;

public class Books1 {
    private String title;

    private int price;

    void show() {
        System.out.println("이 책의 제목은 " + this.title + "이고 가격은 " + this.price + "원입니다.");
    }

    public String getTitle(){
        return this.title;
    }

    public int getPrice(){
        return this.price;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setPrice(int price){
        this.price = price;
    }
}
