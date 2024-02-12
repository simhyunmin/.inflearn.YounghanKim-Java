package casting;

public class Casting3 {
    public static void main(String[] args) {
        //int의 최댓값을 넘는 값을 int형 변환 했을 때 넘은 값만큼 최솟값에서 다시 시작한다.
        //오버플로우
        long maxIntValue = 2147483647;
        long maxIntOver = 2147483648L;
        int intValue = (int)maxIntOver;
        double doubleValue;
        doubleValue = (int)maxIntOver;
        System.out.println(intValue);
        System.out.println(doubleValue);

    }
}
