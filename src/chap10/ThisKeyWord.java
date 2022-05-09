package chap10;
class Computer9{
    String os;
    int memory;

    // 메시지와 PC 정보를 표시하는 메소드
    public void showComputer(){
        System.out.println("PC정보를 표시합니다.");
        // 클래스의 show메소드 호출
        this.show();
    }

    // 필드 변수의 값을 표시하는 메소드
    public void show(){
        System.out.println("OS는 " + this.os + "입니다."); // this키워드 사용
        System.out.println("메모리 크기는 " + this.memory + "GB입니다."); // this키워드 사용
    }

    // 필드변수에서 OS값을 얻음
    public String getOs(){
        return this.os;
    }

    // 필드변수에 Memory 값을 가져옴
    public int getMemory(){
        return memory;
    }

    // 필드 변수에 값을 설정하는 메소드
    public void setOsMemory(String os, int memory){
        this.os = os; // this키워드 사용
        this.memory = memory; // this키워드 사용
        System.out.println("OS는 " + os + "이고, 메모리는 " + memory + "GB입니다.");
    }
}
public class ThisKeyWord {
    public static void main(String[] args) {
        // Computer9클래스에서 객체 생성
        Computer9 com = new Computer9();

        // 객체 필드변수에 각 데이터를 저장
        com.os = "Windows 11";
        com.memory = 16;

        // 메소드를 사용하여 필드 변수에 저장된 데이터를 가져옴
        System.out.println("PC OS는 " + com.getOs() + "입니다.");
        System.out.println("메모리 크기는 " + com.getMemory() + "GB입니다.");

        // 객체 필드변수에 각 데이터를 다시 저장함
        com.setOsMemory("Windows 10", 16);

        // showComputer 메소드 호출
        com.showComputer();
    }
}
