package array;

import java.util.Scanner;
import java.util.Arrays;

public class Problem_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("5개의 정수를 입력하세요:");
        for(int i = 0 ; i <5; i ++){
            arr[i] = scanner.nextInt();
        }

        int sum = Arrays.stream(arr).sum();
        double avg = (double)(sum / arr.length);

        System.out.println("합계: "+sum);
        System.out.println("평균: "+avg);

    }
}
