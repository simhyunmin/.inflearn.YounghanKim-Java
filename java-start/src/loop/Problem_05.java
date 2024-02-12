package loop;

public class Problem_05 {
    public static void main(String[] args) {
        int rows = 9;
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
