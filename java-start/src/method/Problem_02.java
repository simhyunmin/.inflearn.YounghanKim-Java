package method;

public class Problem_02 {
    public static void main(String[] args) {
       print("Hello, world!", 3);
       print("java", 5);
       print("hi", 7);

    }

    public static void print(String message, int num){
        for(int i = 0; i < num; i++){
            System.out.println(message);
        }
    }
}
