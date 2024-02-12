package loop;

public class Problem_01 {
    public static void main(String[] args) {
        for(int i = 1; i < 11; i ++){
            System.out.println(i);
        }
        System.out.println();
        int i = 1;
        while(true){
            System.out.println(i);
            i++;
            if(i == 11){
                break;
            }
        }
    }
}
