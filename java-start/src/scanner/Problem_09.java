package scanner;

import java.util.Scanner;

public class Problem_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력. 입력 중단은 -1");
        int sum = 0;
        int count = 0;
        while(true){
           int num = scanner.nextInt();
           if(num == -1){
               break;
           }
           sum +=num;
           count++;
        }

//        while(( num = scanner.nextInt())!= -1){
//            sum +=num;
//            count++;
//        }  //이런 방법도 있음
        System.out.println("입력한 숫자들의 합계: "+ sum);
        System.out.println("입력한 숫자들의 평균: "+(double)sum/count);

    }
}
