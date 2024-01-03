package loop.ex;

public class LoopEx1 {

    public static void main(String[] args) {
        int count = 1;

        while(count <= 10) {
            System.out.println("while count = " + count);
            count++;
        }

        for(int i = 1; i <=10; i++) {
            count = i;
            System.out.println("for count = " + count);
        }

    }
}
