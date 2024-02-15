package array;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력받을 숫자의 개수 입력");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println(size+"개의 정수를 입력하세요");
        for(int i = 0 ; i <size; i ++){
            arr[i] = scanner.nextInt();
        }

        int sum = Arrays.stream(arr).sum();
        double avg = (double)(sum / size);

        System.out.println("합계: "+sum);
        System.out.println("평균: "+avg);

    }
}
