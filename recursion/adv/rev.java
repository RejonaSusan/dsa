public class rev {

    public static void rev_str(String s, int n){
        if (n == 0) {
            System.out.println(s.charAt(n));
            return;
        }

        System.out.print(s.charAt(n));
        rev_str(s, n-1);
    }
    public static void main(String[] args) {
        String s = "abcd";
        int n = s.length()-1;
        
        rev_str(s, n);
    }
    
}
