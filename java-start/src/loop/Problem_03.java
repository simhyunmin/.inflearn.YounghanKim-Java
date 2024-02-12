package loop;

public class Problem_03 {
    public static void main(String[] args) {
        int max = 3;
        int count = 1;
        int sum = 0;
        while(count <=max){
            sum +=count;
            count++;
        }
        System.out.println(sum);
    }

}
