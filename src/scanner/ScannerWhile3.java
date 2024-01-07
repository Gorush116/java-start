package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("정수를 입력하세요.(0 입력시 프로그램 종료) : ");
            int input = scanner.nextInt();

            if (input == 0) {
                System.out.println("프로그램을 종료합니다. 합계 : " + sum);
                break;
            }

            sum += input;
            System.out.println("입력한 정수 : " + input + " / 현재까지 합계 : " + sum);
        }
    }
}
