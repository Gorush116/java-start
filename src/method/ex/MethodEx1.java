package method.ex;

public class MethodEx1 {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        int sum = a + b + c;
        double average = sum / 3.0;
        System.out.println("average = " + average);

        int x = 15;
        int y = 25;
        int z = 35;
        sum = sum(x, y, z);
        average = avg(sum);
        System.out.println("method average = " + average);

    }

    public static int sum(int num1, int num2, int num3) {

        return num1 + num2 + num3;
    }

    public static double avg(int sum) {
        return sum / 3.0;
    }
}
