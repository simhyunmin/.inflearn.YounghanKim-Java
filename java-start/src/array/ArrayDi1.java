//배열 리펙토링
package array;

public class ArrayDi1 {
    public static void main(String[] args) {
        // 2x3 2차원 배열
        int[][] arr = {
               {1,2,3},
               {4,5,6}
       }; //행2 열3

        for(int row = 0; row<2; row ++){
            for(int column = 0; column<3; column++){
                System.out.println(row+"행 "+column+"열:"+arr[row][column]);
            }
        }

    }
}
