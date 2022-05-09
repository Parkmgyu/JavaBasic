package chap15Practice;

public class Practice2 {
    public static void main(String[] args) {
        Pet pet1 = new Pet();

        pet1.setType("개");
        pet1.setName("해피");
        pet1.setAge((byte)4);
        pet1.setGender(false);

        Pet pet2 = new Pet();

        pet2.setType("고양이");
        pet2.setName("야옹이");
        pet2.setAge((byte)2);
        pet2.setGender(true);

        System.out.println(pet1.getIntroduction());
        System.out.println(pet2.getIntroduction());
    }
}

class Pet{
    private String type;
    private String name;
    private byte age;
    private boolean gender;

    public Pet(){
        this.type = null;
        this.name = null;
        this.age = 0;
        this.gender = true;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(byte age){
        this.age = age;
    }

    public void setGender(boolean gender){
        this.gender = gender;
    }

    public String getIntroduction(){
        if(gender == true){
            return type + " " + name + "는 수컷으로 " + age + "살입니다.";
        } else {
            return type + " " + name + "는 암컷으로 " + age + "살입니다.";
        }

    }
}