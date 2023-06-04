package example.Scala_VS_JAVA.constructor;

public class JavaPerson {
    private String name;
    private int age;


    // 주 생성자 (primary constructor)
    public JavaPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 인수 없는 생성자
    public JavaPerson(){
        this("",0);
    }

    // 인수 하나 받는 생성자
    public JavaPerson(String name){
        this(name,0);
    }

    @Override
    public String toString() {
        return String.format("%s님은 %d세입니다.", name, age);
    }
}
