package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        //일반 for문
        for(int i = 0 ; i<numbers.length;i++){
            int number = numbers[i];
            System.out.println(number);
        }

        System.out.println();


        //향상된 for문, for-each문
        //배열 안에 모든 요소를 돌릴 때 유용한 코드
        for(int number : numbers){
            System.out.println(number);
        }
    }
}
