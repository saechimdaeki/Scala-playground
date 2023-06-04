package example.Scala_VS_JAVA.interfaceAndTrate;

public class JavaMath implements JavaAdder, JavaMultiplier{
    public static void main(String[] args) {
        JavaMath math = new JavaMath();
        System.out.println(math.add(1, 2));
        System.out.println(math.multiply(1, 2));
    }
}
