//배열 리펙토링
package array;

public class ArrayDi0 {
    public static void main(String[] args) {
        // 2x3 2차원 배열
        int[][] arr = new int[2][3]; //행2 열3

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        for(int row = 0; row<arr.length; row ++){
            for(int column = 0; column<arr[row].length; column++){
                System.out.println(row+"행 "+column+"열:"+arr[row][column]);
            }
        }

    }
}
