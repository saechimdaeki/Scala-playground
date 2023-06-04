package example.Scala_VS_JAVA.interfaceAndTrate;

public interface JavaAdder {
    default int add(int a, int b) {
        return a + b;
    }
}

interface JavaMultiplier {
    default int multiply(int a, int b) {
        return a * b;
    }
}
