package chap18exercise;

public class Practice1801 {
    public static void main(String[] args) {
        System.out.println("=================================================");
        Books book1 = new Books("Java 입문", 29800);
        book1.showBookInfo(); //①과 ②의 결과 표시

        book1 = new Books("Java 알고리즘 ",15000);
        book1.showBookInfo(); //③과 ④의 결과 표시

        Books book2 = book1;
        book2.showBookInfo(); //⑤과 ⑥의 결과 표시
        book2.setBookInfo("Java Spring 프로그래밍 ", 32000);

        book1.showBookInfo(); //⑦과 ⑧의 결과 표시

    }
}
