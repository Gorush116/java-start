package cond;

public class Switch3 {

    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        switch(grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3:
            case 4:
                coupon = 4000;
                break;
            default:
                coupon = 500;
        }

        System.out.println("발급받은 쿠폰 : " + coupon);

    }

}
