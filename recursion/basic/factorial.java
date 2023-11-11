public class factorial {

    public static int fact(int n){
        if (n==1){
            return 1;
        }
        int factnm1 = fact(n-1);
        int factn = n * factnm1;
        return factn;
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = fact(n);
        System.out.println(ans);
    }
    
}
