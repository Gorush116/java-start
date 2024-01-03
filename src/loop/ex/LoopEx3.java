package loop.ex;

public class LoopEx3 {

    public static void main(String[] args) {

        int max = 4;
        int sum = 0;

        System.out.println("max = " + max);

        for(int i = 0; i <= max; i++) {
            sum += i;
        }

        System.out.println("sum = " + sum);


        int sum2= 0;
        int j = 0;
        while(j <= max) {
            sum2 += j;
            j++;
        }

        System.out.println("sum2 = " + sum2);

    }
}
