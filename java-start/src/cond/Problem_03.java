package cond;

public class Problem_03 {
    public static void main(String[] args) {
        int dollar = 10;
        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        }else if (dollar == 0){
            System.out.println("환전할 금액이 없습니다.");
        }else {
            int won = dollar * 1300;
            System.out.println("한국돈으로 " + won + "원입니다.");
        }
    }

}
