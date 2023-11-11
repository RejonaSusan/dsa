public class tower_of_hanoi {
    
    public static void toh(int n, String A, String B, String C){
        if (n == 1){
            System.out.println("transfered "+ n + " from " + A + " to " + C);
            return;
        }
        toh(n-1, A, C, B);
        System.out.println("transfered "+ n + " from " + A + " to " + C);
        toh(n-1, B, A, C);
    }

    public static void main(String[] args) {
        toh(2, "S", "H", "D");
    }
}
