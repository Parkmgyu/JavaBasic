package chap16Exercise;

public class Practice1601 {
    public static void main(String[] args) {
        // Books클래스 인스턴스화
        Books book = new Books();

        book.setTitle("Java 기본문법");
        book.setPrice(29800);

        System.out.println("책 제목: " + book.getTitle());
        System.out.println("책 가격: " + book.getPrice());
    }
}
