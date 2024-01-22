package method.ex;

public class MethodEx2 {

    public static void main(String[] args) {
        String message = "Hello, world!";

        loopFor(5, message);

    }

    public static void loopFor(int count, String msg) {

        for (int i = 0; i < count; i++) {
            System.out.println(msg);
        }

    }
}
