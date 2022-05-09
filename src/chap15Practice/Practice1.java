package chap15Practice;

public class Practice1 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setData(1234, "홍길동");

        System.out.println("직원번호 : " + employee.getId());

        System.out.println("직원명 : " + employee.getName());
    }
}

class Employee{
    private int personNum;
    private String personName;

    public Employee(){
        this.personNum = 0;
        this.personName = null;
    }

    public void setData(int personNum, String personName){
        this.personNum = personNum;
        this.personName = personName;
    }

    public int getId(){
        return personNum;
    }

    public String getName(){
        return personName;
    }
}