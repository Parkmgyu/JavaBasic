package chap20Exercise;

public class TextBook1 extends Books {
    private String subject;

    public String getSubject(){
        return this.subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
        System.out.println("이 책의 교과는" + subject + "입니다.");
    }
}
