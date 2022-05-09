package FirstJava;

public class ExamRegex15 {
    public static void main(String[] args) {
        String s = "12.5";
        String regex = "\\d+(\\.\\d+)?";
        if (s.matches(regex)) {
            System.out.println(Double.parseDouble(s));
        }else{
            System.out.println("double아님!");
        }
    }

}
