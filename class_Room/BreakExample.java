public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Breaking the loop at i = " + i);
                break; // Exits the loop when i is 3
            }
            System.out.println("i = " + i);
        }
    }
}