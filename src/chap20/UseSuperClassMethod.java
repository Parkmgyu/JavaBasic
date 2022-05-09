package chap20;

public class UseSuperClassMethod {
    public static void main(String[] args) {
        NoteBook6 nb = new NoteBook6(); // 서브클래스 객체 생성
        nb.setOsMemory("Windows11", 32); // 슈퍼클래스 멤버 호출
        nb.setUseType("모바일"); // 서브클래스 멤버 호출

        nb.show(); // 재정의된 메소드 호출
    }
}
