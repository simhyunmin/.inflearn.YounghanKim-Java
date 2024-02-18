package method;

public class Problem_03 {
    public static void main(String[] args) {
        int balance = 10000;
        balance = deposit(1000, balance);

        balance = withdraw(2000, balance);

        System.out.println("최종 잔액: "+ balance+"원");

    }
    public static int deposit(int money, int  bal){
        System.out.println(money+"원을 입금하였습니다. 현재 잔액: "+bal+"원");
        bal += money;
        return bal;
    }
    public static int withdraw(int money, int bal){
        System.out.println(money+"원을 출금하였습니다. 현재 잔액: "+bal+"원");
        bal -= money;
        return bal;
    }
}
