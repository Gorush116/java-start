package loop.ex;

public class LoopEx2 {

    public static void main(String[] args) {

        int num = 1;
        int count = 0;

        while(count < 10) {
            if(num % 2 == 0) {
                System.out.println(" while 짝수 = " + num);
                count++;
            }
            num++;
        }

        num = 1;
        count = 0;

        for( ; ; ) {
            if(num % 2 == 0) {
                System.out.println(" for 짝수 = " + num);
                count++;
            }
            if(count == 10) {
                break;
            }
            num++;
        }

        // 이렇게도 가능함
        for(int num1 = 2, count1 = 1; count1 <= 10; num1 += 2, count1++) {
            System.out.println(num1);
        }

    }
}
