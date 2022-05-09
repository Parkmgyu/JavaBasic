package FirstJava;

import java.util.regex.Pattern;

public class ExamRegex8 {
    public static void main(String[] args) {
        var s = "휴대폰은 010-2222-0000입니다. 집전화는 031-123-4567입니다.";
        var ptn = Pattern.compile("(?<area>\\d{2,4})-(?<city>\\d{2,4})-(?<local>\\d{2,4})");
        var match = ptn.matcher(s);

        while(match.find()){
            System.out.println("시작위치: " + match.start());
            System.out.println("종료위치: " + match.end());
            System.out.println("매칭문자열: " + match.group());
            System.out.println("앞자리번호 : " + match.group(1));
            System.out.println("중간번호: " + match.group(2));
            System.out.println("끝자리번호: " + match.group(3));
        }
    }
}
