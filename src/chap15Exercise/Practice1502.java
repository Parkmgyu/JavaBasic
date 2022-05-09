package chap15Exercise;

import java.util.Scanner;

class Book3 {
    private static int count = 0;
    private String title;
    private int price;
    private int number;

    public Book3(String title, int price){
        this.title = title;
        this.price = price;
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

public class Practice1502 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        for(int i = 0; i < 3; i++)
        {
            System.out.print("책 제목 입력: ");
            String title = sin.next();

            System.out.print("책 가격 입력: ");
            int price = sin.nextInt();

            Book3 book1 = new Book3(title, price);
            book1.showBook();

            System.out.println();
        }

        System.out.println("책 생성 횟수는 " + Book3.getCount()  + "회입니다.");
    }
}
