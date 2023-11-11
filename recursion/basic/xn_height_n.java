public class xn_height_n {
    
    public static int calpow(int x, int n){
        if (x == 0){
            return 0;
        }
        if (n == 0){
            return 1;
        }

        int xpownm1 = calpow(x, n-1);
        int xpown = xpownm1 * x;
        return xpown;
    }

    public static void main(String[] args) {
        int ans = calpow(2, 5);
        System.out.println(ans);
    }
}
