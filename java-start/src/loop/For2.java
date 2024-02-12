package loop;

public class For2 {
    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;
        for(int i = 1; i <=endNum; i++){
            sum +=i;
            System.out.println("i="+i+" sum="+sum);

        }
        //while문보다 for문이 깔끔한 이유
        //for문은 초기화, 조건 검사, 반복 후 작업 등이 규칙적으로 한 줄에 모두 들어 있어 코드를 이해하기 더 쉽다.
        // 카운터 변수를 확실하게 구분할 수 있기 때문이다.

    }
}
