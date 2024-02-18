package method;

import java.util.Scanner;

public class Problem_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int balance = 0;
        while(true){
            int number = 0;
            System.out.println("----------------------------------------\n" +
                               "1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료\n"+
                               "----------------------------------------");
            System.out.print("선택: ");
            num = scanner.nextInt();
            if(num == 1){
                System.out.print("입금액을 입력하세요: ");
                number = scanner.nextInt();
                balance = deposit(number,balance);
            } else if(num == 2){
                System.out.print("출금액을 입력하세요: ");
                number = scanner.nextInt();
                balance = withdraw(number,balance);
            }else if(num == 3){
                System.out.println("현재 잔액: "+balance+"원");
            }else if(num == 4){
                System.out.println("프로그램을 종료합니다");
                break;
            }else{
                System.out.println("다시 입력");
                continue;
            }
        }
    }

    public static int deposit(int money, int bal){
        bal += money;
        System.out.println(money+"원을 입금하셨습니다. 현재 잔액: "+bal);
        return bal;
    }
    public static int withdraw(int money, int bal){
        if(bal-money <0){
            System.out.println(money+"원을 출금하려 했으나 잔액이 부족합니다.");
            return bal;
        }
        else {
            bal -= money;
            System.out.println(money + "원을 출금하셨습니다. 현재 잔액: " + bal);
            return bal;
        }
    }
}
