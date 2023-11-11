public class xn_height_logn {
    
    public static int calpow(int x, int n){
        if (n == 0){
            return 1;
        }
        if (x == 0){
            return 0;
        }

        if(n%2==0){
            return calpow(x, n/2) * calpow(x, n/2);
        }
        else{
            return calpow(x, n/2) * calpow(x, n/2) * x;
        }
    }

    public static void main(String[] args) {
        int ans = calpow(2, 5);
        System.out.println(ans);
    }
}
