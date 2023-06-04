package example.Scala_VS_JAVA.strings;

public class JavaStringMain {
    public static void main(String[] args) {
        // 문자열 대체
        System.out.println("Hello, World!".replace("World", "Korea"));


        // 치환값 문자열
        String name = "홍길동";
        final String str = String.format("안녕하세요, %s님!",name);
        System.out.println(str);

        final String sum = String.format("1 + 2 = %d", 1+2);
        System.out.println(sum);
    }
}
