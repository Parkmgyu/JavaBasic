package javaPractice2.Practice2;

public class Magazine extends Book{
    private String coverPersonName;
    public Magazine(String title, int price, String coverPersonName){
        super(title, price);
        this.coverPersonName = coverPersonName;
    }
    public void show(){
        System.out.print(getTitle() + " 절찬 판매중!\n정가 " + getPrice() + "원\n이번 표지: " + coverPersonName);
    }
}
