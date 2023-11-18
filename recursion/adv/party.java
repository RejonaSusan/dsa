public class party {


    public static int numPpl(int n){

        if(n<=1){
            return 1;
        }

        int way1 = numPpl(n-1);
        int way2 = (n-1) * numPpl(n-2);
        return way1 + way2;
    }
    public static void main(String[] args) {
        int n = 4;
        int num = numPpl(n);
        System.out.println(num);
    }
    
}
