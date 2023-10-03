package sem3;

public class Number2 {
    
    public static void main(String args[]) {
        int[] numbers = new int[9];
        
        for (int x = 0; x < 9; x++) {
            numbers[x] = x;
        }
        
        for (int x = 0; x < 9; x++) {
            System.out.println(numbers[x]);
        }
    }
}
