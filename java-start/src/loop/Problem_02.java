package loop;

public class Problem_02 {
    public static void main(String[] args) {
        int num = 2;
        int count = 1;
        while(count<=10){
            System.out.println(num);
            num+=2;
            count++;

        }

        System.out.println();

        for(int num1 = 2, count2 = 1; count2 <=10; count2++){
            System.out.println(num1);
            num1+=2;
        }
    }
}
