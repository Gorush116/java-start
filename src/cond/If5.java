package cond;

public class If5 {

    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount += 1000;
            System.out.println("10000원 이상 구매하여 1000원 할인되었습니다.");
        }

        if (age <= 10) {
            discount += 1000;
            System.out.println("어린이 할인으로 1000원 할인되었습니다.");
        }

        System.out.println("지불하셔야 할 금액은 " + (price - discount) + " 원 입니다.");

    }

}
