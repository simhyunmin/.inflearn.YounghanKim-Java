package loop;

public class DoWhile2 {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println("현재 숫자는 : " + i);
            i++;
        }while (i < 3);
        //최초 한 번은 코드 블럭을 꼭 실행해야하는 경우에 사용
    }
}
