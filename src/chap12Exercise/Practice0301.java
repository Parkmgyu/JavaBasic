package chap12Exercise;

class Books3 {
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
        if(price < 0) {
            this.price = 0;
            System.out.println("설정한 값이 " + price + "이기 때문에, 가격은 0을 설정했습니다.");
        }else{
            this.price = price;
        }
    }
}
public class Practice0301 {
    public static void main(String[] args) {
        Books3 b1 = new Books3();
        Books3 b2 = new Books3();

        b1.setTitle("Java");
        b1.setPrice(13000);
        b1.show();

        b2.setTitle("C++");
        b2.setPrice(-10000);
        b2.show();
    }
}
