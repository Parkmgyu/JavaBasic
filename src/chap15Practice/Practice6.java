package chap15Practice;

public class Practice6 {
    public static void main(String[] args) {
        Car car1 = new Car("소나타", 1234, 10.0);

        Car car2 = new Car("K8", 6789);

        car1.run(7.0);
        car2.run(7.0);

        car1.showInfo();
        car2.showInfo();
    }
}
class Car{
    private String type;
    private int number;
    private double gasoline;

    public Car(String type, int number, double gasoline){
        this.type = type;
        this.number = number;
        this.gasoline = gasoline;
    }

    public Car(String type, int number){
        this.type = type;
        this.number = number;
        this.gasoline = 5.0;
    }

    public void run(double gasoline){
        if(this.gasoline > gasoline){
            System.out.println(this.number + "의 " + this.type + "은 휘발유 " + gasoline + "리터 분 주행했습니다.");
            this.gasoline -= gasoline;
        } else{
            System.out.println(this.number + "의 " + this.type + "은 가솔린 부족 때문에 주행할 수 없습니다.");
        }
    }

    public void showInfo(){
        System.out.println("차종 : " + this.type + " 넘버 : " + this.number + " 가솔린 " + this.gasoline + " 리터");
    }
}