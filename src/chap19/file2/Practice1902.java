package chap19.file2;



public class Practice1902 {
    public static void main(String[] args) {
        // 제공 클래스 객체화
        String strLine = null;

        FileIn in = new FileIn(); // 파일 입력
        FileOut out = new FileOut(); // 파일 출력

        if(out.open("practice.txt") == false){
            System.exit(1);
        }

        out.writeIn("Java 입문");
        out.writeIn("교재 판매중!");

        if(out.close() == false){
            System.exit(2);
        }

        if(in.open("practice.txt") == false) {
            System.exit(3);
        }

        while ((strLine = in.readLine()) != null) {
            System.out.println(strLine);
        }
        // 스트림 닫기
        if (in.close() == false) {
            System.exit(4);
        }
    }
}
