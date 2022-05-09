package chap20Exercise;

public class TextBook2 extends TextBook1{
    public void showBook(){
        super.showBook();
        System.out.println("이 책의 교과는" + super.getSubject() + "입니다.");
    }
}
