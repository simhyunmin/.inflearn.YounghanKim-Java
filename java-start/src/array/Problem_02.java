package array;

import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("5개의 정수를 입력하세요:");
        for(int i = 0 ; i <5; i ++){
            arr[i] = scanner.nextInt();
        }

        for(int i = 0 ; i <arr.length; i++){
            if(i == arr.length-1){
                System.out.print(arr[i]);
                break;
            }
            else {
                System.out.print(arr[i] + ", ");
            }
        }

    }
}
