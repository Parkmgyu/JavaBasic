package FirstJava;

public class CheckFloat {
    enum FloatState{
        START, INT, FRAC_START, FRAC, ZERO
    }
    static boolean check(String data){
        var state = FloatState.START;
        for(char ch : data.toCharArray()){
            switch(state){
                case START -> { // 시작
                    if(ch == '0'){
                        state = FloatState.ZERO;
                    }else if(ch >= '1' && ch <= '9'){
                        state = FloatState.INT;
                    }else{
                        return false;
                    }
                }
                case ZERO -> { // 헤더 제로
                    if(ch == '.'){
                        state = FloatState.FRAC_START;
                    }else{
                        return false;
                    }
                }
                case INT -> { // 정수
                    if(ch >= '0' && ch <= '9'){
                        state = FloatState.INT;
                    }else if(ch == '.'){
                        state = FloatState.FRAC_START;
                    }else{
                        return false;
                    }
                }
                case FRAC_START, FRAC -> { // 소수점
                    if(ch >= '0' && ch <= '9'){
                        state = FloatState.FRAC;
                    }else{
                        return false;
                    }
                }
            }
        }
        return switch(state){
            case ZERO, INT, FRAC -> true;
            default ->  false;
        };
    }

    public static void main(String[] args) {
        System.out.println(check(""));      // false
        System.out.println(check("012"));   // false
        System.out.println(check(".12"));   // false
        System.out.println(check("12."));   // false
        System.out.println(check("1.2.3")); // false
        System.out.println(check("1..3"));  // true
        System.out.println(check("0"));     // true
        System.out.println(check("12"));    // true
        System.out.println(check("12.3"));  // true
        System.out.println(check("0.3"));   // true
        System.out.println(check("12.30")); // true
    }
}
