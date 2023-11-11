public class fibonacci {

    public static void fib(int a, int b, int n){
        if (n == 0){                    //base case
            return;
        }
        int c  = a + b;                 //func
        System.out.println(c);
        fib(b, c, n-1);                 //recursion
    }
    public static void main(String[] args) {
        fib(0,1,5); //fib series of n = 7 (n = 5 in func as 2 nums 0 and 1 are already printed)
    }
    
}
