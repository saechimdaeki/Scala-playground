package example.Scala_VS_JAVA.variable;

public class JavaVariableMain {

    public static void main(String[] args) {
        final int i = 1;
//        i =2; // error

        int idx = 1;
        var j = 1;

        idx = 2; // 변경 가능
        j = 3; // 변경 가능
    }
}
