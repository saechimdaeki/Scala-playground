package example.Scala_VS_JAVA.method;

public class JavaMethodMain {

    public int add(int a, int b) {
        return a + b;
    }

    public double triangle(double a, double b) {
        double a2 = a * a;
        double b2 = b * b;
        return Math.sqrt(a2 + b2);
        // triangle(3.0, 4.0) => 5.0
    }
}
