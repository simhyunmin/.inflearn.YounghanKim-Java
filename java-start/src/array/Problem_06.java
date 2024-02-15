package array;

import java.util.Scanner;

public class Problem_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력받을 숫자의 개수 입력");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        int minNum, maxNum;

        System.out.println(size+"개의 정수를 입력하세요");
        for(int i = 0 ; i <size; i ++){
            arr[i] = scanner.nextInt();
        }

        minNum = arr[0];
        maxNum = arr[0];
        for (int j : arr) {
            if (minNum > j) {
                minNum = j;
            }
        }
        for (int j : arr) {
            if (maxNum < j) {
                maxNum = j;
            }
        }

        System.out.println(maxNum);
        System.out.println(minNum);


    }
}
