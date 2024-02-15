//배열의 길이
package array;

public class ArrayDi2 {
    public static void main(String[] args) {
        // 2x3 2차원 배열
        int[][] arr = new int[2][3]; //행2 열3

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        for(int row = 0; row<2; row ++){
            for(int column = 0; column<3; column++){
                System.out.println(row+"행 "+column+"열:"+arr[row][column]);
            }
        }

    }
}
