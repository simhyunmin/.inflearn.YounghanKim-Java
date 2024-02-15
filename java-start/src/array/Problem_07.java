package array;

import java.util.Scanner;
import java.util.Arrays;

public class Problem_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생수를 입력하세요:");
        int size = scanner.nextInt();
        int[][] arr = new int[size][3];
        String[] subjects = {"국어", "영어", "수학"};

        for(int row = 0; row < arr.length; row++){
            System.out.println((row+1)+"번 학생의 성적을 입력하세요:");
            for(int column = 0; column < 3; column++) {
                System.out.print(subjects[column]+" 점수:");
                arr[row][column] = scanner.nextInt();
            }
        }

        for(int row = 0; row < arr.length; row++){
            int sum = Arrays.stream(arr[row]).sum();
            System.out.print((row+1)+"번 학생 총점: "+ sum + ", 평균: "+ (double)sum/3);
            System.out.println();
        }

    }
}
