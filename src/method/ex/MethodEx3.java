package method.ex;

public class MethodEx3 {

    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(balance, 5000);

        balance = withdraw(balance, 16000);

        balance = withdraw(balance, 6000);

    }

    public static int deposit(int balance, int amount) {

        balance += amount;
        System.out.println(amount + "원을 입금하셨습니다. 현재 잔액  : " + balance);

        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if(balance < amount) {
            System.out.println("잔액이 부족합니다.");
        } else {
            balance -= amount;
            System.out.println(amount + "원을 출금하셨습니다. 현재 잔액 : " + balance);
        }
        return balance;
    }
}
